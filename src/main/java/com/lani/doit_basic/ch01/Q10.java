package com.lani.doit_basic.ch01;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정숫값의 자리수 구하기 ");
//        String n = sc.nextLine();
//        int length = n.length();

        int n;
        do{
            System.out.println("정숫값 : ");
            n = sc.nextInt();
        } while(n <= 0);

        int length = 0;
        while(n > 0) {
            n /= 10;
            length++;
        }

        System.out.println("그 수는 " + length + "자리입니다.");

        sc.close();
    }
}
