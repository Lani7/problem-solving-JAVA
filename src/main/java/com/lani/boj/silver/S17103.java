package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S17103 {

    private static boolean[] getPrimes(int n) {
        boolean[] primes = new boolean[n + 1];

        // 소수가 아니면 true 이다.
//        primes[0] = primes[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(primes[i])   continue;
            for (int j = i * 2; j <= n; j += i) {
                primes[j] = true;
            }
        }

        return primes;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 골드바흐의 추측 : 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
        // 골드바흐 파티션 : 짝수 N을 두 소수의 합으로 나타내는 표현

        // 1. 1,000,000 이하의 모든 소수를 배열에 저장한다.
        boolean[] primes = getPrimes(1000000);

        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bf.readLine()); // 짝수로 주어진다.
            int cnt = 0;    // 골드바흐 파티션의 수

            // 3. n / 2 이하의 수 중에서 각 소수의 합이 n이 되는 경우의 수를 찾는다.
            for (int j = 2; j <= n / 2; j++) {
                // j가 소수일 경우
                if(primes[j])           continue;
                // n을 소수로 뺐을 때 나오는 수가 소수이면 cnt가 증가한다.
                if( !primes[n - j] )    cnt++;
            }

            // 골드바흐 파티션의 수를 출력한다.
            System.out.println(cnt);
        }

        bf.close();
    }
}
