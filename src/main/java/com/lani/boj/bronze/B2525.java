package com.lani.boj.bronze;

import java.util.Scanner;

public class B2525 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 시
        int b = sc.nextInt(); // 분
        int c = sc.nextInt(); // 요리 소요 시간

        if( b + c > 60) {
            int addHour = c / 60;
            a += addHour;
            b += (c % 60);
            if(b > 60) {
                a++;
                b -= 60;
            } else if(b == 60) {
                a++;
                b = 0;
            }
        } else if( b + c == 60) {
            a++;
            b = 0;
        } else {
            b += c;
        }
        if(a > 24) a -= 24;
        else if(a == 24) a = 0;
        System.out.println(a + " " + b);

        sc.close();
    }
}
