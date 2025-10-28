package org.example.spotify;

import org.example.spotify.enums.SORT_TYPE;

public class Playlist {
    private Track[] tracks;
    private int maxSize;
    private int size = 0;

    public Playlist(int maxSize){
        this.maxSize = maxSize;
        this.tracks = new Track[maxSize];
    }

    public boolean addTrack(Track track){
        if(size >= maxSize){
            throw new RuntimeException("Playlist cheia");
        }

        tracks[size] = track;
        size++;
        return true;
    }

    private Track[] buildMaxHeapAlphabetical() {
        Track[] tracksHeap = new Track[size+1];

        for(int i = 1; i < size+1; i++){
            Track track = tracks[i-1];
            tracksHeap[i] = track;

            if(i == 1) continue;

            int parentIndex = i / 2;
            Track parent = tracksHeap[parentIndex];
            int iterIndex = i;

            while(parentIndex >= 1 && parent.getMusic().compareTo(track.getMusic()) > 0){
                tracksHeap[iterIndex] = parent;
                tracksHeap[parentIndex] = track;

                iterIndex = parentIndex;
                parentIndex = parentIndex / 2;
                parent = tracksHeap[parentIndex];
            }
        }

        return tracksHeap;
    }

    // ongoing
    private Track[] downHeap(Track[] heap, int limit){
        int iterIndex = 1;
        int leftIndex = iterIndex * 2;
        int rightIndex = iterIndex * 2 + 1;

        Track track = heap[iterIndex];
        Track left = heap[leftIndex];
        Track right = heap[rightIndex];

        while(iterIndex < limit && leftIndex < limit && rightIndex < limit){
            System.out.println(iterIndex + " " + leftIndex + " " + rightIndex);

            if(left != null && right != null){
                boolean chooseLeft = left.getMusic().compareTo(right.getMusic()) > 0;

                if(chooseLeft){
                    heap[iterIndex] = left;
                    heap[leftIndex] = track;
                }else{
                    heap[iterIndex] = right;
                    heap[rightIndex] = track;
                }
            }

            if(left != null && left.getMusic().compareTo(track.getMusic()) > 0){
                heap[iterIndex] = left;
                heap[leftIndex] = track;
            }

            if(right != null && right.getMusic().compareTo(track.getMusic()) > 0){
                heap[iterIndex] = right;
                heap[rightIndex] = track;
            }

            iterIndex = leftIndex;
            leftIndex = leftIndex * 2;
            rightIndex = leftIndex * 2 + 1;

            if(rightIndex >= limit || leftIndex >= limit) break;

            left = heap[leftIndex];
            right = heap[rightIndex];
        }

        return heap;
    }

    public boolean sort(SORT_TYPE sortType){
        if(sortType == SORT_TYPE.Relevance){
            return true;
        }

        Track[] tracksHeap = buildMaxHeapAlphabetical();

        for(Track t : tracksHeap){
            if(t != null) System.out.print(t.getMusic() + " | ");
        }

        System.out.println();

        int heapLimit = size;
        for(int i = 1; i <= (size+1)/2; i++){
            Track aux = tracksHeap[i];
            tracksHeap[i] = tracksHeap[heapLimit];
            tracksHeap[heapLimit] = aux;

            downHeap(tracksHeap, heapLimit);
        }

        for(Track t : tracksHeap){
            if(t != null) System.out.print(t.getMusic() + " | ");
        }

        return true;
    }
}
