package com.lani.doit_basic.ch02;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

    static void rcopy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        int t;
        for (int i = 0; i < num; i++) {
            a[i] = b[b.length - i - 1];
//            t = a[i];
//            b[i] = t;
        }

    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 요솟수: ");
        int numa = stdIn.nextInt();
        int[] a = new int[numa];

        for (int i = 0; i < numa; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("b의 요솟수: ");
        int numb = stdIn.nextInt();
        int[] b = new int[numb];

        for (int i = 0; i < numb; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = stdIn.nextInt();
        }

        rcopy(a, b);

        System.out.println( "a 배열 : " +  Arrays.toString(a));

    }
}
