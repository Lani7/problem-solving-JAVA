package com.lani.boj;

import java.io.IOException;
import java.util.Scanner;

public class Q3003 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int chess;

        // 킹, 퀸
        for (int i = 0; i < 2; i++) {
            chess = sc.nextInt();
            System.out.print( 1 - chess + " ");
        }

        // 룩, 비숍, 나이트
        for (int i = 0; i < 3; i++) {
            chess = sc.nextInt();
            System.out.print( 2 - chess + " ");
        }

        // 폰
        chess = sc.nextInt();
        System.out.print( 8 - chess + " ");

        sc.close();

    }
}
