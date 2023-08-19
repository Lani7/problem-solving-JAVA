package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1735 {
    private static int gcd(int a, int b) {
        if(b == 0)  return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] split1 = bf.readLine().split(" ");
        int a = Integer.parseInt(split1[0]);    // 분자
        int b = Integer.parseInt(split1[1]);    // 분모

        String[] split2 = bf.readLine().split(" ");
        int c = Integer.parseInt(split2[0]);    // 분자
        int d = Integer.parseInt(split2[1]);    // 분모

        int nu = (a * d) + (b * c); // 분자
        int de = b * d; // 분모

        // 기약분수 : 분모와 분자의 공약수가 1뿐인 분수.
        // 분모와 분자를 그들의 최대공약수로 나누면 기약분수가 된다.
        int gcd = gcd(nu, de);  // 최대공약수

        // 기약분수
        System.out.print(nu / gcd + " " + de / gcd);   // 분자, 분모

        bf.readLine();
    }
}
