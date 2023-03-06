package com.lani.doit_basic.ch02;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    static void swap(int[] a, int idx1, int idx2) {
//        System.out.println(Arrays.toString(a));
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
//        System.out.println("a[" + idx1 + "]과 a[" + idx2 + "]를 교환합니다.");
    }

    static void reverse(int[] a) {
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length/2; i++) {
            System.out.println("a[" + i + "]과 a[" + (a.length - i - 1) + "]를 교환합니다.");
            swap(a, i, a.length - i - 1);
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);     // 배열 a의 요소를 역순으로 정렬

//        System.out.println(Arrays.toString(x));
        System.out.println("역순 정렬을 마쳤습니다.");

    }
}
