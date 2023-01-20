package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        long a = Long.parseLong(st.nextToken());   // 고정 비용
        long b = Long.parseLong(st.nextToken());   // 가변 비용
        long c = Long.parseLong(st.nextToken());   // 판매 가격
        long num = 0;   // 최초로 이익이 발생하는 판매량

        if(c <= b) System.out.println("-1");
        else {
            num = a / (c-b) + 1;
            System.out.println(num);
        }

        bf.close();
    }
}
