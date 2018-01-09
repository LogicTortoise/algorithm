package com.hht.sort;

import edu.princeton.cs.algs4.StdIn;

import static com.hht.sort.SortCommonMethod.isSorted;
import static com.hht.sort.SortCommonMethod.show;

/**
 * Created by User on 2018/1/9.
 */
public class SelectionSortTest {
    public static void main(String[] args) {
        System.out.println("Start sort...");
        String[] a = StdIn.readAllStrings();
        System.out.println("original array:");
        show(a);
        SelectionSort.sort(a);
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
    E:\CodeClub\algorithm\src  javac com/hht/sort/SelectionSort*.java -Xlint:unchecked
    E:\CodeClub\algorithm\src  java com.hht.sort.SelectionSortTest < ..\algs4-data\words3.txt
    Original array
    bed bug dad yes zoo now for tip ilk dim tag jot sob nob sky hut men egg few jay owl joy rap gig wee was wad fee tap tar dug jam all bad yet
    after shuffle array
    tap now yes tip jay wad nob bug jam egg wee yet owl was sob bad dad tar jot gig tag rap ilk joy few zoo dug men hut bed dim fee sky for all
    after sort...
    all bad bed bug dad dim dug egg fee few for gig hut ilk jam jay jot joy men nob now owl rap sky sob tag tap tar tip wad was wee yes yet zoo
    */
}

