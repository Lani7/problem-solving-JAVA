package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] primes = new boolean[n + 1];
        // boolean 배열 초기값 : false

        primes[1] = true; // 1은 소수가 아니다.

        // 소수 : false

        // 소수가 되는 수의 배수를 지우면 남은 건은 소수만 된다.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(primes[i]) continue; // 소수가 아니면(true) 반복문을 다시 돈다.

            // i가 소수일 경우
            // 소수가 되는 수의 배수는 소수가 아니다.
            for (int j = 2; i * j <= n; j++) {
                primes[i * j] = true;
            }

//            for (int j = i * i; j <= n; j += i) {
//                primes[j] = true;
//            }

        }

        for (int i = m; i <= n; i++) {
            if(!primes[i]) System.out.println(i);   // 소수(false)만 출력
        }

        bf.close();
    }
}
