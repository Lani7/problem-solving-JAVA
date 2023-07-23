package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 삼각형의 세 각을 입력받는다.
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        // 세 각의 합
        int sum = a + b + c;

        if(a == 60 && b == 60 && c == 60) System.out.println("Equilateral");
        else if (sum == 180) {
            if(a == b || b == c || a == c) System.out.println("Isosceles");
            else if(a != b && b != c && a != c) System.out.println("Scalene");
        }
        else System.out.println("Error");

        bf.close();
    }
}
