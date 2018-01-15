package com.hht.test.priorityQueue;

import com.hht.priorityQueue.MinPQ;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import static com.hht.sort.SortCommonMethod.printIsSorted;
import static com.hht.sort.SortCommonMethod.show;

public class PriorityQueueTest {
    public static void main(String[] args) {
        System.out.println("Start ...");
        String[] a = StdIn.readAllStrings();
        String[] asorted = new String[a.length];
        System.out.println("original array:");
        show(a);
        MinPQ pq = new MinPQ<String>(a);
        StdOut.println("min | size  | delMin");
        for (int i = a.length; i > 0; i--) {
            StdOut.print(pq.min() + " | " + pq.size());
            if(!pq.isEmpty()){
                asorted[a.length - i] = (String) pq.min();
                StdOut.print(" | " + pq.delMin());
            }
            StdOut.println("");
        }
        printIsSorted(asorted);
        pq.insert("aaainsert");
        pq.insert("zzzinsert");
        StdOut.println("");
        StdOut.println("min | size  | delMin");
        StdOut.println(pq.min() + " | " + pq.size() + " | " + pq.delMin());
        StdOut.println(pq.min() + " | " + pq.size() + " | " + pq.delMin());
    }

    /*
    E:\CodeClub\algorithm\src  javac com/hht/priorityQueue/*.java -Xlint:unchecked
    E:\CodeClub\algorithm\src  javac com/hht/test/priorityQueue/*.java -Xlint:unchecked
    E:\CodeClub\algorithm\src  java com.hht.test.priorityQueue.PriorityQueueTest < ..\algs4-data\words3.txt

    * */
}
