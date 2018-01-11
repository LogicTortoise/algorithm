package com.hht.sort;

import static com.hht.sort.SortCommonMethod.isSorted;
import static com.hht.sort.SortCommonMethod.less;

/**
 * for exercise 2.2.11
 */
public class MergeXSort {
    public static void sort(Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(a, 0, a.length - 1, aux);
    }

    private static void sort(Comparable[] a, int l, int r, Comparable[] aux) {
        if (l >= r) return;
        if (isSorted(a, l, r)) return;
        if (r - l < 7) {
            InsertSort.sort(a, l, r);  //optimizing short array sort
            return;
        }
        int mid = (l + r) / 2;
        //reverse aux and a location in argument,BRAVO!
        //then, here need not copy a to aux again and again.
        sort(aux, l, mid, a);
        sort(aux, mid + 1, r, a);

        //if left max value less then right min value , that indicate this subarray is sorted.
        // mid + 1 behind mid, to ensure stability
        if(!less(aux[mid+1], aux[mid])){
            System.arraycopy(aux, l, a, l, r - l + 1);
            return;
        }

        merge(a, l, r, mid, aux);
    }

    private static void merge(Comparable[] a, int l, int r, int mid, Comparable[] aux) {
        int lf = l;
        int rf = mid + 1; // !!
        for (int i = l; i < r + 1; i++) {
            if (lf > mid) {
                a[i] = aux[rf++];
            } else if (rf > r) {   //rf is a increment, so limit rf scope in mid+1_r
                a[i] = aux[lf++];
            } else if (less(aux[rf], aux[lf])) {   //ensure stability.
                a[i] = aux[rf++];
            } else {
                a[i] = aux[lf++];
            }
        }
    }
    /*
    when array length is too short,use insertion sort is better.
    E:\CodeClub\algorithm\src (master)
    λ java com.hht.test.sort.SortCompare < ..\algs4-data\4Kints.txt
    Start contending...
    Array length: 4000
    Sorted
    MergeSort elapsed time: 0.01
    Sorted
    MergeXSort elapsed time: 0.0
    Sort contend finished...

    E:\CodeClub\algorithm\src (master)
    λ java com.hht.test.sort.SortCompare < ..\algs4-data\1Mints.txt
    Start contending...
    Array length: 1000000
    Sorted
    MergeSort elapsed time: 1.282
    Sorted
    MergeXSort elapsed time: 1.212
    Sort contend finished...
     */

    /*
    add whether array is sorted, MergeX sort is better.
    λ java com.hht.test.sort.SortCompare < ..\algs4-data\words3.txt
    Start contending...
    Array length: 35
    Sorted
    MergeSort elapsed time: 0.001
    Sorted
    MergeXSort elapsed time: 0.0
    Sort contend finished...
    λ java com.hht.test.sort.SortCompare < ..\algs4-data\1Mints.txt
    Start contending...
    Array length: 1000000
    Sorted
    MergeSort elapsed time: 1.251
    Sorted
    MergeXSort elapsed time: 1.212
    Sort contend finished...
     */

    /*
    remove a copy to aux, MergeX is best, maybe its all functions are in one class.
    E:\CodeClub\algorithm\src (master)
    λ java com.hht.test.sort.SortCompare < ..\algs4-data\1Mints.txt
    Start contending...
    Array length: 1000000
    Sorted
    MergeSort elapsed time: 1.267
    Sorted
    MergeXSort elapsed time: 1.147
    Sorted
    MergeX elapsed time: 1.079
    Sort contend finished...

    E:\CodeClub\algorithm\src (master)
    λ java com.hht.test.sort.SortCompare < ..\algs4-data\4Kints.txt
    Start contending...
    Array length: 4000
    Sorted
    MergeSort elapsed time: 0.003
    Sorted
    MergeXSort elapsed time: 0.002
    Sorted
    MergeX elapsed time: 0.002
    Sort contend finished...

    E:\CodeClub\algorithm\src (master)
    λ java com.hht.test.sort.SortCompare < ..\algs4-data\1Kints.txt
    Start contending...
    Array length: 1000
    Sorted
    MergeSort elapsed time: 0.003
    Sorted
    MergeXSort elapsed time: 0.001
    Sorted
    MergeX elapsed time: 0.001
    Sort contend finished...

     */
}
