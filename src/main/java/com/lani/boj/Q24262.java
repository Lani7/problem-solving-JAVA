package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24262 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        System.out.println("1");  // 상수 시간 O(1)
        System.out.println("0"); // 상수항만 가진 다항식의 차수

        bf.close();
    }
}
