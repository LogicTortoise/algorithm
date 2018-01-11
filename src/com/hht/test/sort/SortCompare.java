package com.hht.test.sort;

import com.hht.sort.*;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by User on 2018/1/10.
 */
public class SortCompare {
    public static void main(String[] args) {

        System.out.println("Start contending...");
        String[] a = StdIn.readAllStrings();
        System.out.println("Array length: " + a.length);

//        runningTime("ThreeWayQuickSort", a);
//        runningTime("QuickSort", a);
//        runningTime("ShellSort", a);
        runningTime("MergeSort", a);
        runningTime("MergeXSort", a);
        runningTime("MergeX", a);
//        runningTime("Selection", a);
//        runningTime("InsertSort", a);
//        runningTime("InsertXSort", a);

        System.out.println("Sort contend finished...");
    }

    private static void runningTime(String name, Comparable[] a) {
        Stopwatch timer;
        StdRandom.shuffle(a);
        timer = new Stopwatch();
        if (name.equals("ThreeWayQuickSort")) {
            ThreeWayQuickSort.sort(a);
        }
        if (name.equals("QuickSort")) {
            QuickSort.sort(a);
        }
        if (name.equals("Selection")) {
            Selection.sort(a);
        }
        if (name.equals("InsertSort")) {
            InsertSort.sort(a);
        }
        if (name.equals("InsertXSort")) {
            InsertSort.sort(a, 0, a.length - 1);
//            SortCommonMethod.printIsSorted(a);
        }
        if (name.equals("ShellSort")) {
            ShellSort.sort(a);
        }
        if (name.equals("MergeSort")) {
            MergeSort.sort(a);
            SortCommonMethod.printIsSorted(a);
        }
        if (name.equals("MergeXSort")) {
            MergeXSort.sort(a);
            SortCommonMethod.printIsSorted(a);
        }
        if (name.equals("MergeX")) {
            MergeX.sort(a);
            SortCommonMethod.printIsSorted(a);
        }
        if (name.equals("HeapSort")) {
//            ThreeWayQuickSort.sort(a);
        }
        System.out.println(name + " elapsed time: " + timer.elapsedTime());
    }

    /*
    Compile:
    E:\CodeClub\algorithm\src  javac com/hht/sort/*.java -Xlint:unchecked
    E:\CodeClub\algorithm\src  javac com/hht/test/sort/SortCompare.java -Xlint:unchecked
    E:\CodeClub\algorithm\src  java com.hht.test.sort.SortCompare < ..\algs4-data\words3.txt
    E:\CodeClub\algorithm\src  java com.hht.test.sort.SortCompare < ..\algs4-data\1Kints.txt
    E:\CodeClub\algorithm\src  java com.hht.test.sort.SortCompare < ..\algs4-data\2Kints.txt
    E:\CodeClub\algorithm\src  java com.hht.test.sort.SortCompare < ..\algs4-data\4Kints.txt
    E:\CodeClub\algorithm\src  java com.hht.test.sort.SortCompare < ..\algs4-data\1Mints.txt

    Competed Result:
        Insert/Selection sort can't finish sorting of 1Mints data!
        amazing shell sort, you know ,it just changes step of insert-sort, and do nothing else, but it can sort 1M data!
        Selection sort is worst.
        Insert sort is penult.
        Three way quick sort is best!

    Terminal Test Result:

    E:\CodeClub\algorithm\src>java com.hht.test.sort.SortCompare < ..\algs4-data\words3.txt
    Start contending...
    Array length: 35
    ThreeWayQuickSort elapsed time: 0.001
    QuickSort elapsed time: 0.0
    ShellSort elapsed time: 0.0
    Selection elapsed time: 0.0
    InsertSort elapsed time: 0.001
    Sort contend finished...

    E:\CodeClub\algorithm\src>java com.hht.test.sort.SortCompare < ..\algs4-data\1Kints.txt
    Start contending...
    Array length: 1000
    ThreeWayQuickSort elapsed time: 0.002
    QuickSort elapsed time: 0.001
    ShellSort elapsed time: 0.001
    Selection elapsed time: 0.005
    InsertSort elapsed time: 0.003
    Sort contend finished...

    E:\CodeClub\algorithm\src>java com.hht.test.sort.SortCompare < ..\algs4-data\2Kints.txt
    Start contending...
    Array length: 2000
    ThreeWayQuickSort elapsed time: 0.001
    QuickSort elapsed time: 0.001
    ShellSort elapsed time: 0.001
    Selection elapsed time: 0.019
    InsertSort elapsed time: 0.013
    Sort contend finished...

    E:\CodeClub\algorithm\src>java com.hht.test.sort.SortCompare < ..\algs4-data\4Kints.txt
    Start contending...
    Array length: 4000
    ThreeWayQuickSort elapsed time: 0.002
    QuickSort elapsed time: 0.002
    ShellSort elapsed time: 0.002
    Selection elapsed time: 0.082
    InsertSort elapsed time: 0.064
    Sort contend finished...

    E:\CodeClub\algorithm\src>java com.hht.test.sort.SortCompare < ..\algs4-data\1Mints.txt
    Start contending...
    Array length: 1000000
    ThreeWayQuickSort elapsed time: 1.265
    QuickSort elapsed time: 1.313
    ShellSort elapsed time: 3.152
    */
}
