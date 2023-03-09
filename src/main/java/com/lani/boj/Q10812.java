package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10812 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n+1];
        for (int i = 1; i <= n; i++) {
            basket[i] = i;
        }

        int[] rotated = new int[n+1];
        for (int i = 1; i <= n; i++) {
            rotated[i] = i;
        }

        for (int l = 0; l < m; l++) {
            StringTokenizer s = new StringTokenizer(bf.readLine(), " ");
            int i = Integer.parseInt(s.nextToken());
            int j = Integer.parseInt(s.nextToken());
            int k = Integer.parseInt(s.nextToken());

            int d = (j - k) + 1;    // k부터 end인 j까지의 차이

            // k부터 end인 j까지의 숫자를 rotated 배열에 넣는다
            for (int o = k, q = i; o <= j; o++, q++) {
                rotated[q] = basket[o];
            }
            // 처음begin부터 k 이전까지의 숫자를 rotated 배열에 넣는다
            for (int o = i; o < k; o++) {
                rotated[d + o] = basket[o];
            }
            // rotated 배열을 basket 배열로 옮긴다
            for (int o = 1; o <= j; o++) {
                basket[o] = rotated[o];
            }
        }

        for (int i = 1; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }

        bf.close();
    }
}
