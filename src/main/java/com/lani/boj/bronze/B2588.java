package com.lani.boj.bronze;

import java.util.Scanner;

public class B2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int one = b % 10;
        int ten = (b / 10) % 10;
        int hun = b / 100;

        System.out.println(a * one);
        System.out.println(a * ten);
        System.out.println(a * hun);
        System.out.println( (a * one) + (a * ten * 10) + (a * hun * 100) );

        sc.close();
    }
}
