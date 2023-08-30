package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;    // 가장 긴 변의 길이
        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0)  break;

            max = 0;
            // 가장 긴 변의 길이를 구한다.
            if(a > max) max = a;
            if (b > max)  max = b;
            if (c > max)  max = c;

            // 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
            if(max == a && max >= b + c || max == b && max >= a + c
                    || max == c && max >= a + b)
                System.out.println("Invalid");
            else {
                if(a == b && b == c) System.out.println("Equilateral");
                else if(a == b || b == c || a == c) System.out.println("Isosceles");
                else System.out.println("Scalene");
            }
        }
        bf.close();
    }
}
