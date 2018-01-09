package com.hht.sort;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by User on 2018/1/9.
 */
public class SortCommonMethod {
    public static boolean less(Comparable a, Comparable b) {
        if (a.getClass().equals(b.getClass())) {
            return a.compareTo(b) < 0;
        } else {
            throw new ClassCastException();
        }
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void show(Comparable[] a) {
        for (Comparable anA : a) {
            StdOut.print(anA + " ");
        }
        StdOut.println();
    }

}
