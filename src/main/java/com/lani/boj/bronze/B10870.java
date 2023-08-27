package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 5
public class B10870 {
    private static int fibonacci(int a, int b, int n) {
        // 0과 1로 시작한다.
        // 1번째 피보나치 수는 1이다.
        // 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

        // 0번째 피보나치 수는 0이다.
        if(n == 0)  return 0;

        while( n-- > 1) {
            return fibonacci( b, a + b, n);
        }
        return b;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        System.out.println(fibonacci(0, 1, n));

        bf.close();
    }
}
