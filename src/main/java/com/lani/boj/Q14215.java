package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int max = 0;

        // 가장 긴 변의 길이를 찾는다
        if(a > max)     max = a;
        if(b > max)     max = b;
        if(c > max)     max = c;

        // 가장 긴 변의 길이가 나머지 두 변의 합보다 길지 않으면 가장 긴 변의 길이를 줄인다.
        while(true) {
            if(max == a && max >= b + c)       { max--; a--; }
            else if(max == b && max >= a + c)  { max--; b--; }
            else if(max == c && max >= a + b)  { max--; c--; }
            else break;
        }

        // 만들 수 있는 가장 큰 삼각형의 둘레를 출력
        if(max == a)        System.out.println(max + b + c);
        else if (max == b)  System.out.println(max + a + c);
        else                System.out.println(max + a + b);

        bf.close();
    }
}
