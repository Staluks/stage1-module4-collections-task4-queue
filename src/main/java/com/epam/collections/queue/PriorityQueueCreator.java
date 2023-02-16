package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> sortedList = new PriorityQueue<>( new ListComparator());
        sortedList.addAll(secondList);
        sortedList.addAll(firstList);
        return sortedList;
    }
class ListComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        String o1First = String.valueOf(o1.charAt(0));
        String o2First = String.valueOf(o2.charAt(0));

        if(o1 == null){
            return -1;
        }
        if(o2 == null){
            return 1;
        }
        int count = 0;
        String a = String.valueOf(o1.charAt(count));
        String b = String.valueOf(o2.charAt(count));
        if (a.equals(b)) {
            while(a.equals(b)){
                count++;
                a = String.valueOf(o1.charAt(count));
                b = String.valueOf(o2.charAt(count));
            }
            return b.compareTo(a);
        }
        return o2First.compareTo(o1First);

    }
}
}
