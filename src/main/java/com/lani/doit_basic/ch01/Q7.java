package com.lani.doit_basic.ch01;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값: ");
        int n = stdIn.nextInt();

        int sum = (1 + n) * ( n -1 +1 ) / 2;

//        int sum = (1 + n) *  (n / 2) + (n % 2 == 1 ? (n+1)/2 : 0);

        System.out.println("합계는 " + sum);
    }
}
