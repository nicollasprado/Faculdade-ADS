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

            while(parentIndex >= 1 && parent.getMusic().compareTo(track.getMusic()) < 0){
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
    private void downHeap(Track[] heap, int limit){
        int iterIndex = 1;

        while(iterIndex <= limit / 2){
            int leftIndex = iterIndex * 2;
            int rightIndex = leftIndex + 1;

            if(leftIndex > limit) break;

            int largestIndex = leftIndex;

            if(rightIndex <= limit && heap[rightIndex].getMusic().compareTo(heap[leftIndex].getMusic()) > 0){
                largestIndex = rightIndex;
            }

            Track aux = heap[iterIndex];
            heap[iterIndex] = heap[largestIndex];
            heap[largestIndex] = aux;

            iterIndex = largestIndex;
        }
    }

    public boolean sort(SORT_TYPE sortType){
        if(sortType == SORT_TYPE.Relevance){
            return true;
        }

        Track[] tracksHeap = buildMaxHeapAlphabetical();

        for(int i = size; i > 1; i--){
            Track aux = tracksHeap[1];
            tracksHeap[1] = tracksHeap[i];
            tracksHeap[i] = aux;

            downHeap(tracksHeap, i - 1);
        }

        return true;
    }
}
