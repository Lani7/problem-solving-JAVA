package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 13909 창문 닫기
public class S13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        System.out.println( (int)Math.sqrt(n) );

        // 창문이 열고 - 닫고 - 열릴려면 약수가 홀수개가 되어야 한다.
        // 약수가 홀수개가 되는 수는 어떤 수의 제곱이 되는 수이다.
        // 따라서 제곱근을 구하거나, 제곱이 되는 수의 개수를 구한다.

        bf.close();
    }
}
