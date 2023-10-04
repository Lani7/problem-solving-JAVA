package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11050 이항 계수 1
public class B11050 {
    private static int factorial(int x) {
        int num = 1;
        while(x > 0) {
            num *= x--;
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 이항 계수는 N개의 물건 중 K개를 순서 없이 고르는 경우의 수와 같다.
        System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));

        br.close();
    }
}
