package com.hht.priorityQueue;

import java.util.NoSuchElementException;

import static com.hht.sort.SortCommonMethod.exch;
import static com.hht.sort.SortCommonMethod.less;

/**
 * *if using linked-table create MinPQ, it will too complicated, because in inserting progress it need judge insert to left tree or right.
 * using array is much better.
 * *Those lines have bugs which have comment have error before.
 */
public class MinPQ<key extends Comparable<key>> {
    int N = 0;
    Comparable[] pq;

    public MinPQ(Comparable[] a) {
        if (null == a) return;
        N = a.length;
        pq = new Comparable[a.length + 2];
        System.arraycopy(a, 0, pq, 1, a.length);
        int i = N / 2;  //here a.length/2 is confused, because it dont care last level node in heap sorting.
        while (i > 0) {   //for-loop is better.
            sink(i--);
        }

        System.out.println("pq[1]: " + pq[1]);
    }

    public void swim(int i) {
        while (i > 1 && less(pq[i], pq[i / 2])) {  //if-else in while can up if-else to while-()
            exch(pq, i, i / 2);
            i = i / 2;
        }
    }

    public void sink(int i) {
        while (i < N / 2 + 1) {  // scope of i need be careful.
            int j = 2 * i;
            if (j < N && less(pq[j + 1], pq[j])) {
                j++;
            }
            if (!less(pq[j], pq[i])) {  //order of i,j is important! don't mess them up.
                break;
            }
            exch(pq, i, j);
            i = j;   // j is a variable, can't use 2*i directly.
        }
    }

    public void insert(key a) {
        pq[++N] = a;
        swim(N);
    }

    public key delMin() {
        if (isEmpty()) {  //use isEmpty function is really bravo idea.
            throw new NoSuchElementException("Priority queue is empty");
        }
        key min = (key) pq[1];
        exch(pq, N--, 1);
        if (N > 1) {
            sink(1);
        }
        pq[N + 1] = null;
        return min;
    }

    public key min() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }
        return (key) pq[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }
}
