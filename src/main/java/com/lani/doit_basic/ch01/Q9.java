package com.lani.doit_basic.ch01;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.print("a값 : ");
        a = sc.nextInt();

        while(true) {
            System.out.print("b값 : ");
            b = sc.nextInt();
            if(b > a)   break;
            System.out.println("a보다 더 큰 값을 입력하세요!");
        }

//        while(a > b || a == b) {
//            System.out.println("a보다 더 큰 값을 입력하세요!");
//            System.out.print("b값 : ");
//            b = sc.nextInt();
//        }

        System.out.println("b - a : " + (b - a));
        sc.close();
    }

}

