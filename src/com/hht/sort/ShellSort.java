package com.hht.sort;

import static com.hht.sort.SortCommonMethod.exch;
import static com.hht.sort.SortCommonMethod.less;

/**
 * Created by User on 2018/1/10.
 */
public class ShellSort {
    public static void sort(Comparable[] a) {
        int h = 1;
        int N = a.length;
        while (h < N/3) { //'h < N' is not good enough,
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) { // j>=h not j>h, 'j>h' will lost the first item of array.
                    exch(a, j, j - h);
                }
            }
            h /= 3;
        }
    }
}
