package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());

//        long sum = 0;
//        long in = n-2;
//        for (int i = 1; i <= in; i++) {
//            sum += (n - 2) * (n - 1) / 2;
//            n--;
//        }
//        System.out.println( sum );  // O(n^3)

        System.out.println( n * (n - 1) * (n - 2) / 6); // 조합 nCr
        System.out.println("3"); // 다항식의 차수

        bf.close();
    }
}
