package com.hht.sort;

import static com.hht.sort.SortCommonMethod.exch;
import static com.hht.sort.SortCommonMethod.less;

/**
 * Created by User on 2018/1/9.
 */
public class InsertSort {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void sort(Comparable[] a, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            for (int j = i; j > l && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
