package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1676 팩토리얼 0의 개수
public class S1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 0이 나오기 위해서는 10(5*2)의 배수가 있어야 한다.
        // 5의 개수를 센다. (팩토리얼 특성상 5를 곱하면 2도 곱할 테니까.)
        // 5의 n승일 때마다 누적으로 더해준다.

        while(n > 0) {
            cnt += n / 5;
            n /= 5;
        }

        System.out.println(cnt);

        br.close();
    }
}
