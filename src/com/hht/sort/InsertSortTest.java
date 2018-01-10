package com.hht.sort;

import edu.princeton.cs.algs4.StdIn;

import static com.hht.sort.SortCommonMethod.isSorted;
import static com.hht.sort.SortCommonMethod.show;

/**
 * Created by User on 2018/1/9.
 */
public class InsertSortTest {
    public static void main(String[] args) {
        System.out.println("Start sort...");
        String[] a = StdIn.readAllStrings();
        System.out.println("original array:");
        show(a);
        InsertSort.sort(a);
        assert isSorted(a);
        if(isSorted(a)){
            System.out.println("Sorted");
        }else{
            System.out.println("Unsorted");
        }
        System.out.println("after sort...");
        show(a);
    }

    /*
    E:\CodeClub\algorithm\src  javac com/hht/sort/InsertSort*.java -Xlint:unchecked
    E:\CodeClub\algorithm\src  java com.hht.sort.InsertSortTest < ..\algs4-data\words3.txt
    Start sort...
    original array:
    bed bug dad yes zoo now for tip ilk dim tag jot sob nob sky hut men egg few jay owl joy rap gig wee was wad fee tap tar dug jam all bad yet
    Sorted
    after sort...
    all bad bed bug dad dim dug egg fee few for gig hut ilk jam jay jot joy men nob now owl rap sky sob tag tap tar tip wad was wee yes yet zoo
    */
}

