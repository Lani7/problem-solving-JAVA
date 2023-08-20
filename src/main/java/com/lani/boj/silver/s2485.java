package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s2485 {
    private static int gcd(int a, int b) {
        if(b == 0)  return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n-1]; // 가로수 사이의 배열
        int dis = 0;    // 가로수의 전체 거리
        int prev = 0;
        int gcd = 0;
        for (int i = 0; i < n; i++) {
            int tree = Integer.parseInt(bf.readLine());

            // 가로수의 전체 거리를 구한다.
            if(i == 0)   {
                dis = tree;
                prev = tree;
                continue;
            }
            else if (i == n - 1)    dis = tree - dis;

            arr[i - 1] = tree - prev;

            prev = tree;
        }

        // 최대공약수를 찾는다.
        for (int i = 0; i < arr.length; i++) {
            gcd = gcd(gcd, arr[i]);
        }

        System.out.println( (dis / gcd + 1) - n);

        bf.close();
    }
}
