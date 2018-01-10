package com.hht.test.sort;

import com.hht.sort.ShellSort;
import com.hht.sort.SortCommonMethod;
import edu.princeton.cs.algs4.StdIn;

import static com.hht.sort.SortCommonMethod.show;

/**
 * Created by User on 2018/1/9.
 */
public class ShellSortTest {
    public static void main(String[] args) {
        System.out.println("Start sort...");
        String[] a = StdIn.readAllStrings();
        ShellSort.sort(a);
        SortCommonMethod.printIsSorted(a);
        System.out.println("after sort...");
        show(a);
    }

    /*
    E:\CodeClub\algorithm\src  javac com/hht/sort/ShellSort.java -Xlint:unchecked
    E:\CodeClub\algorithm\src  javac com/hht/test/sort/ShellSortTest.java -Xlint:unchecked
    E:\CodeClub\algorithm\src  java com.hht.test.sort.ShellSortTest < ..\algs4-data\words3.txt
    Original array
    bed bug dad yes zoo now for tip ilk dim tag jot sob nob sky hut men egg few jay owl joy rap gig wee was wad fee tap tar dug jam all bad yet
    after shuffle array
    tap now yes tip jay wad nob bug jam egg wee yet owl was sob bad dad tar jot gig tag rap ilk joy few zoo dug men hut bed dim fee sky for all
    after sort...
    all bad bed bug dad dim dug egg fee few for gig hut ilk jam jay jot joy men nob now owl rap sky sob tag tap tar tip wad was wee yes yet zoo
    */
}

