package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine()); // 영수증에 적힌 총 금액
        int n = Integer.parseInt(bf.readLine()); // 영수증에 적힌 구매한 물건의 종류의 수

        int a = 0;      // 각 물건의 가격
        int b = 0;      // 각 물건의 개수
        int sum = 0;    // 구매한 물건 총 가격
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum += a * b;
        }

        if(x == sum)
            System.out.println("Yes");
        else
            System.out.println("No");

        bf.close();
    }
}
