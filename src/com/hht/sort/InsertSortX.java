package com.hht.sort;

import edu.princeton.cs.algs4.StdOut;

import static com.hht.sort.SortCommonMethod.exch;
import static com.hht.sort.SortCommonMethod.less;

/**
 * Created by User on 2018/1/9.
 */
public class InsertSortX {
    public static void sort(Comparable[] a) {
        //no more using exch-function
        Comparable tmp;
        for (int i = 1; i < a.length; i++) {
            tmp = a[i];
            int j = i;
            for (; j > 0 && less(tmp, a[j - 1]); j--) {
                a[j] = a[j - 1];   // bigger item forward to right one position
//                exch(a, j, j - 1);
            }
            a[j] = tmp;
        }
    }
}
