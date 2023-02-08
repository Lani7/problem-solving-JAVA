package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        int[][] arr = new int[15][15];

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(bf.readLine());
            int n = Integer.parseInt(bf.readLine());
            // 0층에는 n 호만큼의 거주자 수를 넣는다
            for (int j = 1; j <= n; j++) {
                arr[0][j] = j;
            }

            int sum = 0;
            // 배열에 각 층의 호마다 거주자 수를 넣는다
            for (int j = 1; j <= k; j++) {
                // 각 층의 거주자(총합) 초기화
                sum = 0;
                for (int l = 1; l <= n; l++) {
                    // 아래층 거주자 숫자 가져오기
                    int b = arr[j-1][l];
                    // 거주자(총합)에 아래층 거주자 숫자를 더한다
                    sum += b;
                    // 거주자(총합)을 해당 배열에 저장한다
                    arr[j][l] = sum;
                }
            }

            System.out.println(arr[k][n]);
        }

        bf.close();
    }
}
