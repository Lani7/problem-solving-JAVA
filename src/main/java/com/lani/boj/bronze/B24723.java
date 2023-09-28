package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24723 녹색거탑
public class B24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 부분집합의 개수는 2^n과 같다. (nC0 + nC1 + nC2 + ... + nCn)
        System.out.println( (int)Math.pow(2, n) );

        br.close();
    }
}
