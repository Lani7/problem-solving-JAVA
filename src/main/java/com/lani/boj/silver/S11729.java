package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 하노이 탑 이동 순서
public class S11729 {
    static int k = 0;    // 옮긴 횟수
    static StringBuilder sb = new StringBuilder();
    private static void move(int n, int a, int b) {
        k++;
        if(n > 1) {
            move(n - 1, a, 6 - (a + b));
        }

        sb.append(a + " " + b + "\n");

        if(n > 1) {
            move(n - 1, 6 - (a + b), b);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        move(n, 1, 3);

        System.out.println(k);
        System.out.println(sb.toString());

        bf.close();
    }
}
