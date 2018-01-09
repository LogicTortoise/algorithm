package com.hht.sort;

import static com.hht.sort.SortCommonMethod.exch;
import static com.hht.sort.SortCommonMethod.less;

/**
 * The meaning of Selection is that nth cycle need exchange min value to arr[n-1]
 */
public class SelectionSort {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, min, i);
        }
    }
}
