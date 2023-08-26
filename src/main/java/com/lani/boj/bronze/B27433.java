package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팩토리얼 2
public class B27433 {
    private static long factorial(int n) {
        if (n == 0)     return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(factorial(n));

        bf.close();
    }
}
