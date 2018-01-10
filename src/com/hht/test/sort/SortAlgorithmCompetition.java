package com.hht.test.sort;

import com.hht.sort.InsertSort;
import com.hht.sort.QuickSort;
import com.hht.sort.ThreeWayQuickSort;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import static com.hht.sort.SortCommonMethod.isSorted;

/**
 * Created by User on 2018/1/10.
 */
public class SortAlgorithmCompetition {
    public static void main(String[] args) {
        System.out.println("Start contending...");
        String[] a = StdIn.readAllStrings();
        System.out.println("Array length: " + a.length);

        StdRandom.shuffle(a);
        Stopwatch timer = new Stopwatch();
        InsertSort.sort(a);
        printIsSorted(a);
        System.out.println("Insert sort elapsed time: " + timer.elapsedTime());

        StdRandom.shuffle(a);
        timer = new Stopwatch();
        Selection.sort(a);
        printIsSorted(a);
        System.out.println("Selection sort elapsed time: " + timer.elapsedTime());

        StdRandom.shuffle(a);
        timer = new Stopwatch();
        QuickSort.sort(a);
        printIsSorted(a);
        System.out.println("QuickSort elapsed time: " + timer.elapsedTime());

        StdRandom.shuffle(a);
        timer = new Stopwatch();
        ThreeWayQuickSort.sort(a);
        printIsSorted(a);
        System.out.println("ThreeWayQuickSort elapsed time: " + timer.elapsedTime());

        System.out.println("Sort contend finished...");
    }

    private static void printIsSorted(String[] a) {
        if (isSorted(a)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }
    }

    /*
    Compile:
    E:\CodeClub\algorithm\src  javac com/hht/sort/*.java -Xlint:unchecked
    E:\CodeClub\algorithm\src  javac com/hht/test/sort/SortAlgorithmCompetition.java -Xlint:unchecked
    E:\CodeClub\algorithm\src  java com.hht.test.sort.SortAlgorithmCompetition < ..\algs4-data\words3.txt
    E:\CodeClub\algorithm\src  java com.hht.test.sort.SortAlgorithmCompetition < ..\algs4-data\1Kints.txt
    E:\CodeClub\algorithm\src  java com.hht.test.sort.SortAlgorithmCompetition < ..\algs4-data\2Kints.txt
    E:\CodeClub\algorithm\src  java com.hht.test.sort.SortAlgorithmCompetition < ..\algs4-data\4Kints.txt
    E:\CodeClub\algorithm\src  java com.hht.test.sort.SortAlgorithmCompetition < ..\algs4-data\1Mints.txt

    Competed Result:
        Selection sort is worst.
        Insert sort is penult.
        Three way quick sort is best!

    Terminal Test Result:
    E:\CodeClub\algorithm\src>java com.hht.test.sort.SortAlgorithmCompetition < ..\algs4-data\words3.txt
    Start contending...
    Array length: 35
    Sorted
    Insert sort elapsed time: 0.0
    Sorted
    Selection sort elapsed time: 0.0
    Sorted
    QuickSort elapsed time: 0.0
    Sorted
    ThreeWayQuickSort elapsed time: 0.001
    Sort contend finished...

    E:\CodeClub\algorithm\src>java com.hht.test.sort.SortAlgorithmCompetition < ..\algs4-data\1Kints.txt
    Start contending...
    Array length: 1000
    Sorted
    Insert sort elapsed time: 0.005
    Sorted
    Selection sort elapsed time: 0.005
    Sorted
    QuickSort elapsed time: 0.001
    Sorted
    ThreeWayQuickSort elapsed time: 0.0
    Sort contend finished...

    E:\CodeClub\algorithm\src>java com.hht.test.sort.SortAlgorithmCompetition < ..\algs4-data\2Kints.txt
    Start contending...
    Array length: 2000
    Sorted
    Insert sort elapsed time: 0.014
    Sorted
    Selection sort elapsed time: 0.021
    Sorted
    QuickSort elapsed time: 0.001
    Sorted
    ThreeWayQuickSort elapsed time: 0.001
    Sort contend finished...

    E:\CodeClub\algorithm\src>java com.hht.test.sort.SortAlgorithmCompetition < ..\algs4-data\4Kints.txt
    Start contending...
    Array length: 4000
    Sorted
    Insert sort elapsed time: 0.051
    Sorted
    Selection sort elapsed time: 0.079
    Sorted
    QuickSort elapsed time: 0.002
    Sorted
    ThreeWayQuickSort elapsed time: 0.002
    Sort contend finished...

    Insert/Selection sort can't finish sorting of followed data!
    E:\CodeClub\algorithm\src>java com.hht.test.sort.SortAlgorithmCompetition < ..\algs4-data\1Mints.txt
    Start contending...
    Array length: 1000000
    Sorted
    QuickSort elapsed time: 1.378
    Sorted
    ThreeWayQuickSort elapsed time: 1.304
    Sort contend finished...
    */
}
