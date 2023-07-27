package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());

        System.out.println(n * (n-1) / 2);  // 등차수열 O(n^2)
        System.out.println("2"); // 다항식의 차수

        bf.close();
    }
}
