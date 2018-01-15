package com.hht.sort;

import static com.hht.sort.SortCommonMethod.exch;
import static com.hht.sort.SortCommonMethod.less;

/**
 * Created by User on 2018/1/13.
 */
public class HeapSort {
    public static void sort(Comparable[] a) {
        if (null == a && a.length < 1) return;
        int N = a.length;
        Comparable[] pq = new Comparable[N + 1];
        System.arraycopy(a, 0, pq, 1, N);
        //followed i = a.length/2 is confused, because it do not care last level node in heap sorting.
        for (int i = N / 2; i >= 1; i--) {
            sink(pq, i, N);
        }
        int k = 0;
        while (N > 1) {
            a[k++] = pq[1];
            exch(pq, 1, N--);
            pq[N + 1] = null;
            sink(pq, 1, N);
        }
        a[k] = pq[1];
    }

    static void sink(Comparable[] pq, int i, int N) {
        while (2 * i <= N) {
            int j = 2 * i;
            if (j < N && less(pq[j + 1], pq[j])) {  //min pq!
                j++;
            }
            if (less(pq[j], pq[i])) {
                exch(pq, i, j);
                i = j;
            } else {
                break;
            }
        }
    }
}
