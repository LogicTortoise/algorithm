package com.hht.sort;

import static com.hht.sort.SortCommonMethod.less;

/**
 * Created by User on 2018/1/11.
 */
public class MergeSort {
    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        sort(a, l, mid);
        sort(a, mid + 1, r);
        merge(a, l, r, mid);
    }

    private static void merge(Comparable[] a, int l, int r, int mid) {
        int lf = l;
        int rf = mid + 1; // !!
        Comparable[] aux = new Comparable[r - l + 1];
        for (int i = 0; i < r - l + 1; i++) {
//            StdOut.println("l:" + l + " r:" + r + " lf:" + lf + " rf: " + rf + " i: " + i + " r-l+1: " + (r - l + 1));
            if (lf > mid) {
                aux[i] = a[rf++];
            } else if (rf > r) { //rf is a increment, so limit rf scope in mid+1_r
                aux[i] = a[lf++];
            } else if (less(a[rf], a[lf])) {
                aux[i] = a[rf++];
            } else {
                aux[i] = a[lf++];
            }
        }
        System.arraycopy(aux, 0, a, l, r - l + 1);

    }
}
