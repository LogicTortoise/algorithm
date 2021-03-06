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

        runningTime("ThreeWayQuickSort", a);
        runningTime("QuickSort", a);
        runningTime("ShellSort", a);
        runningTime("MergeSort", a);
        runningTime("MergeXSort", a);
        runningTime("MergeX", a);
        runningTime("HeapSort", a);
        runningTime("Selection", a);
        runningTime("InsertSort", a);
        runningTime("InsertSortWithBound", a);
        runningTime("InsertSortX", a);

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
        if (name.equals("InsertSortWithBound")) {
            InsertSort.sort(a, 0, a.length - 1);
//            SortCommonMethod.printIsSorted(a);
        }
        if (name.equals("InsertSortX")) {
            InsertSortX.sort(a);
            SortCommonMethod.printIsSorted(a);
        }
        if (name.equals("ShellSort")) {
            ShellSort.sort(a);
        }
        if (name.equals("MergeSort")) {
            MergeSort.sort(a);
//            SortCommonMethod.printIsSorted(a);
        }
        if (name.equals("MergeXSort")) {
            MergeXSort.sort(a);
//            SortCommonMethod.printIsSorted(a);
        }
        if (name.equals("MergeX")) {
            MergeX.sort(a);
//            SortCommonMethod.printIsSorted(a);
        }
        if (name.equals("HeapSort")) {
            HeapSort.sort(a);
//            SortCommonMethod.printIsSorted(a);
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

    λ java com.hht.test.sort.SortCompare < ..\algs4-data\1Kints.txt
    Start contending...
    Array length: 1000
    ThreeWayQuickSort elapsed time: 0.002
    QuickSort elapsed time: 0.0
    ShellSort elapsed time: 0.0
    MergeSort elapsed time: 0.0
    MergeXSort elapsed time: 0.001
    MergeX elapsed time: 0.001
    HeapSort elapsed time: 0.001
    Selection elapsed time: 0.006
    InsertSort elapsed time: 0.003
    InsertXSort elapsed time: 0.003
    Sort contend finished...

    λ java com.hht.test.sort.SortCompare < ..\algs4-data\2Kints.txt
    Start contending...
    Array length: 2000
    ThreeWayQuickSort elapsed time: 0.001
    QuickSort elapsed time: 0.001
    ShellSort elapsed time: 0.002
    MergeSort elapsed time: 0.001
    MergeXSort elapsed time: 0.001
    MergeX elapsed time: 0.001
    HeapSort elapsed time: 0.001
    Selection elapsed time: 0.02
    InsertSort elapsed time: 0.012
    InsertXSort elapsed time: 0.012
    Sort contend finished...

    λ java com.hht.test.sort.SortCompare < ..\algs4-data\4Kints.txt
    Start contending...
    Array length: 4000
    ThreeWayQuickSort elapsed time: 0.002
    QuickSort elapsed time: 0.002
    ShellSort elapsed time: 0.002
    MergeSort elapsed time: 0.002
    MergeXSort elapsed time: 0.002
    MergeX elapsed time: 0.002
    HeapSort elapsed time: 0.002
    Selection elapsed time: 0.081
    InsertSort elapsed time: 0.074
    InsertXSort elapsed time: 0.048
    Sort contend finished...

    λ java com.hht.test.sort.SortCompare < ..\algs4-data\1Mints.txt
    Start contending...
    Array length: 1000000
    ThreeWayQuickSort elapsed time: 1.229
    QuickSort elapsed time: 1.341
    ShellSort elapsed time: 3.319
    MergeSort elapsed time: 1.348
    MergeXSort elapsed time: 1.14
    MergeX elapsed time: 1.081
    HeapSort elapsed time: 2.618
    */
}
