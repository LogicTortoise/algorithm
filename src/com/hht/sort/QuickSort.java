package com.hht.sort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import static com.hht.sort.SortCommonMethod.less;
import static com.hht.sort.SortCommonMethod.exch;
import static com.hht.sort.SortCommonMethod.show;

/**
 * Created by User on 2018/1/9.
 */
public class QuickSort {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int l, int r) {
        if (l >= r) return;
        int mid = partition(a, l, r);
        sort(a, l, mid - 1);
        sort(a, mid + 1, r);
    }

    /**
     * 原书版本
     */
    private static int partition(Comparable[] a, int l, int r) {
        int i = l;
        int j = r + 1;
        Comparable guard = a[l];
        while (true) {
            while (less(a[++i], guard)) {  // in while loop, no compare to a[l], waiting for after loop to exchange.
                if (i == r) { // when array is sorted, val i will out of the array boundary
                    break;
                }
            }
            while (less(guard, a[--j])) {  //if '--j' won't lost last item of array, val j need 'j = r+1'
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, l, j);
        return j;
    }

//    /**
//     * 微调版本
//     * 使用比较习惯的i++, j--,while中用i<=j替代了true
//     */
//    private static int partition(Comparable[] a, int l, int r) {
//        int i = l + 1;
//        int j = r;
//        Comparable guard = a[l];
//        while (i <= j) {
//            while (less(a[i], guard)) {
//                if(i < r){
//                    i++;
//                }else {
//                    break;
//                }
//            }
//            while (less(guard, a[j])) {
//                j--;
//            }
//            if (i >= j) {
//                break;
//            }
//            exch(a, i++, j--);
//        }
//        exch(a, l, j);
//        return j;
//    }

}
