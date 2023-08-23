package com.lani.boj.silver;

import java.io.*;

public class s4948 {
    // 소수를 구한다. 에라토스테네스의 체
    private static int getPrime(int a, int b) {
        int cnt = 0;

        // 모든 수를 배열의 인덱스에 담는다.
        boolean[] primes = new boolean[b+1];
//        primes[1] = true;   // 1은 소수가 아니다.

        // 2부터 시작하는 모든 수 중에서 소수를 찾는다.
        for(int i = 2; i * i <= b; i++) {
            // 소수가 아니면 반복을 건너뛴다.
            if(primes[i])   continue;

            // 소수라면 그 소수의 배수는 소수가 아니다.
            for(int j = 2; i * j <= b; j ++) {
                primes[i * j] = true;
            }
        }

        for (int i = a; i <= b; i++) {
            if(!primes[i])  cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 자연수 n 보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
        while(true) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0)  break;

            // 소수의 개수를 출력한다.
            bw.write(getPrime(n+1, 2 * n) + "\n");
        }

        bf.close();
        bw.flush();
        bw.close();
    }
}
