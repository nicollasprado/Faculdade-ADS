package org.example.spotify;

import org.example.spotify.enums.SORT_TYPE;
import org.example.spotify.exceptions.TrackNotFoundException;

import java.util.Arrays;
import java.util.List;

public class Playlist {
    private MyTrack[] myTracks;
    private List<MyTrack> myTrackList;
    private int maxSize;
    private int size = 0;

    public Playlist(int maxSize){
        this.maxSize = maxSize;
        this.myTracks = new MyTrack[maxSize];
    }

    public boolean addTrack(MyTrack myTrack){
        if(size >= maxSize){
            throw new RuntimeException("Playlist cheia");
        }

        myTracks[size] = myTrack;
        size++;
        return true;
    }

    public void find(String name) throws TrackNotFoundException {
        boolean found = false;

        for(MyTrack t : myTrackList){
            if(t.getMusic().equals(name)){
                System.out.println(t.toString());
                found = true;
                break;
            }
        }

        if(!found) throw new TrackNotFoundException(name);
    }

    public void listAll(){
        for(MyTrack t : myTrackList){
            System.out.println(t.toString());
        }
    }

    private MyTrack[] buildMaxHeapAlphabetical() {
        MyTrack[] tracksHeap = new MyTrack[size+1];

        for(int i = 1; i < size+1; i++){
            MyTrack myTrack = myTracks[i-1];
            tracksHeap[i] = myTrack;

            if(i == 1) continue;

            int parentIndex = i / 2;
            MyTrack parent = tracksHeap[parentIndex];
            int iterIndex = i;

            while(parentIndex >= 1 && parent.getMusic().compareTo(myTrack.getMusic()) < 0){
                tracksHeap[iterIndex] = parent;
                tracksHeap[parentIndex] = myTrack;

                iterIndex = parentIndex;
                parentIndex = parentIndex / 2;
                parent = tracksHeap[parentIndex];
            }
        }

        return tracksHeap;
    }

    private void downHeap(MyTrack[] heap, int limit){
        int iterIndex = 1;

        while(iterIndex <= limit / 2){
            int leftIndex = iterIndex * 2;
            int rightIndex = leftIndex + 1;

            if(leftIndex > limit) break;

            int largestIndex = leftIndex;

            if(rightIndex <= limit && heap[rightIndex].getMusic().compareTo(heap[leftIndex].getMusic()) > 0){
                largestIndex = rightIndex;
            }

            MyTrack aux = heap[iterIndex];
            heap[iterIndex] = heap[largestIndex];
            heap[largestIndex] = aux;

            iterIndex = largestIndex;
        }
    }

    public boolean sort(SORT_TYPE sortType){
        if(sortType == SORT_TYPE.RELEVANCIA){
            return true;
        }

        MyTrack[] tracksHeap = buildMaxHeapAlphabetical();

        for(int i = size; i > 1; i--) {
            MyTrack aux = tracksHeap[1];
            tracksHeap[1] = tracksHeap[i];
            tracksHeap[i] = aux;

            downHeap(tracksHeap, i - 1);

        }

        List<MyTrack> heapList = Arrays.asList(tracksHeap);

        myTrackList = heapList.subList(1, heapList.size());

        return true;
    }
}
