package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        int size = firstQueue.size()+ secondQueue.size();
        arr.offer(firstQueue.remove());
        arr.offer(firstQueue.remove());
        arr.add(secondQueue.remove());
        arr.add(secondQueue.remove());
        while(arr.size()<size){
            firstQueue.add(arr.removeLast());
            arr.add(firstQueue.remove());
            arr.add(firstQueue.remove());
            secondQueue.add(arr.removeLast());
            arr.add(secondQueue.remove());
            arr.add(secondQueue.remove());
        }
        return arr;
    }
}
