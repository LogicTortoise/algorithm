package com.hht.sort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import static com.hht.sort.SortCommonMethod.exch;
import static com.hht.sort.SortCommonMethod.show;

/**
 * Three-way sort is better than two-way sort in array which has too many repeated items
 * Three-way sort algorithm can't use partition function any more, because it requires partition function return two partition flags
 * Three-way sort algorithm's amount of information is maximized, maybe comparative instruction return three parts result once, and
 * other sort algorithms just use two of three parts.
 */
public class ThreeWayQuickSort {
    public static void sort(Comparable[] a) {
//        StdOut.println("Original array");
//        show(a);
        StdRandom.shuffle(a);
//        StdOut.println("after shuffle array");
//        show(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int left, int right) {
        if (left >= right) return;
        int lf = left;
        int rf = right;
        int ef = lf + 1;
        int cmp = 0;
        Comparable guard = a[left];

        while (ef <= rf) {
            cmp = a[ef].compareTo(guard);
            if (cmp < 0) {
                exch(a, ef, lf);
                lf++;
                ef++;
            } else if (cmp > 0) {
                exch(a, ef, rf);
                rf--;
            } else {
                ef++;
            }
        }

        sort(a, left, lf - 1);
        sort(a, rf + 1, right);
    }
}
