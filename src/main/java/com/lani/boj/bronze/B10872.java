package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10872 팩토리얼
public class B10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 1;
        for (int i = n; i > 0; i--) {
            ans *= i;
        }
        System.out.println(ans);

        br.close();
    }
}
