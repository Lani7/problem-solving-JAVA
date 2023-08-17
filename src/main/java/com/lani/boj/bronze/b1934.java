package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1934 {
    private static int gcd(int a, int b) {
        if(b == 0)  return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        int g = 0; // 최대공약수
        for (int i = 0; i < t; i++) {
            String[] split = bf.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            // a의 배수이면서 b의 배수인 자연수 = a와 b의 공배수
            // 이런 공배수 중에서 가장 작은 수 = 최소공배수

            int ab = a * b;

            // 최대공약수를 구한다.

            // solution 3
            g = gcd(a, b);

            // solution 2
//            int r = 0;
//            while(true) {
//                r = a % b;
//                if(r == 0) { g = b; break; }
//                a = b;
//                b = r;
//            }

            // solution 1
            // a, b와 나누었을 때 나머지가 0이 되는 수를 찾아서 나눈다.
//            int max = (a > b) ? a : b;
//            for (int j = 1; j <= max; j++) {
//                if(a % j == 0 && b % j == 0) {
//                    g = j;
//                }
//            }

            // 최대공약수와 a와 b를 각각 최대공약수로 나눈 수를 모두 곱한다.
//            System.out.println( g * (a / g) * (b / g) );
            // 최대공약수 = a * b / 최대공약수
            System.out.println( ab / g);
        }
        bf.close();
    }
}
