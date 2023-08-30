package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S13241 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bf.readLine().split(" ");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        long ab = a * b;

        long gcd = 0;       // 최소공약수
        long r = 0;
        while(true) {
            r = a % b;
            if(r == 0)  { gcd = b; break; }
            a = b;
            b = r;
        }

        // 최소공배수
        System.out.println(ab / gcd);

        bf.close();
    }
}
