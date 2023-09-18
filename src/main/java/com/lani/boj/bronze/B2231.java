package com.lani.boj.bronze;

import java.io.*;

// 2231 분해합
public class B2231 {
    // 분해합이 n이 되는 수를 찾는다.
    private static int search(int n) {
        int len = (int)(Math.log10(n) + 1);
        int sum = 0;
        int i;

        // n이 4자릿수일 경우, n = m + d1 + d2 + d3 + d4 이다.
        // 식을 정리하면 n - (d1 + d2 + d3 + d4) = m 이 된다.
        // n - (한 자릿수의 최대값인 9 * 자릿수) => 생성자가 될 수 있는 최솟값부터 반복 시작
        for (i = n - (len * 9); i < n; i++) {
            // 각 i의 분해합을 구한다. 분해합 == i + (각 자릿수의 합)
            sum = i;

            // i의 자릿수 구하기
            int digit = i;
            while(digit > 0) {
                sum += digit % 10;
                digit /= 10;
            }

            // 분해합이 n인, 최소 생성자를 리턴한다.
            if(sum == n)
                return i;
        }

        // 생성자가 없으면 0을 리턴한다.
        return 0;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(search(n));

        br.close();
    }
}
