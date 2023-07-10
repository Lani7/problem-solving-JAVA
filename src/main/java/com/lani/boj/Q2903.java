package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int dot = 2;    // 한 변에 있는 점의 개수
        int total = 0;  // 총 점의 개수

        for (int i = 0; i < n; i++) {
            dot = (dot - 1) + dot;
            total = dot * dot;
        }

        System.out.println(total);

    }
}
