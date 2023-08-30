package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int a1 = Integer.parseInt(s[0]);
        int a0 = Integer.parseInt(s[1]);
        int c = Integer.parseInt(bf.readLine());
        int n0 = Integer.parseInt(bf.readLine());

        int n = n0;

        // 1.
        // a0이 음수일 경우
//        if(a0 < 0) {
//            // a1과 c의 차이(절대값)과 a2의 절대값을 더한 수를 n에 저장한다.
//            n = Math.abs(a1 - c) + Math.abs(a0);
//        }

        // n ≥ n0에 대해 f(n) ≤ c × g(n), 즉 O(n) 정의를 만족하면 1, 아니면 0을 출력
        // f(n) = a1 * n + a0
//        if(a1 * n + a0 > c * n)      System.out.println("0");
//        else                         System.out.println("1");

        // 2.
        // n ≥ n0에 대해 f(n) ≤ c × g(n)이 아닐 경우 0을 출력
        if(a1 * n + a0 > c * n)      System.out.println("0");
        else {
            // a1이 c보다 클 경우 0을 출력 (a1, c는 각각 n과 곱해지는 수)
            if(a1 > c) System.out.println("0");
            else       System.out.println("1");
        }

        bf.close();
    }
}
