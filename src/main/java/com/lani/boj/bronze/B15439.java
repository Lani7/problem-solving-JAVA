package com.lani.boj.bronze;

import java.io.*;

// 15439 베라의 패션
public class B15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(n * (n - 1) );

        br.close();
    }
}
