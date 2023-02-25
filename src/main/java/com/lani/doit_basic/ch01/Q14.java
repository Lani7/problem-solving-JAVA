package com.lani.doit_basic.ch01;

import java.util.Scanner;

public class Q14 {


    static void triangleLB(int n) {     // 왼쪽 아래가 직각인 이등변삼각형을 출력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    static void triangleLU(int n) {     // 왼쪽 위가 직각인 이등변삼각형을 출력
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--)
                System.out.print('*');
            System.out.println();
        }
    }

    static void triangleRU(int n) {     // 오른쪽 위가 직각인 이등변삼각형을 출력
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++)
                System.out.print(' ');
            for (int j = i; j >= 1; j--)
                System.out.print('*');
            System.out.println();
        }
    }

    static void triangleRB(int n) {     // 오른쪽 아래가 직각인 이등변삼각형을 출력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

        do{
            System.out.print ("몇 단 삼각형입니까?: ");
            n = stdIn.nextInt();
        } while(n <= 0);

        System.out.println("1.------triangleLB-------");
        triangleLB(n);

        System.out.println("2.------triangleLU-------");
        triangleLU(n);

        System.out.println("3.------triangleRU-------");
        triangleRU(n);

        System.out.println("4.------triangleRB-------");
        triangleRB(n);
    }
}
