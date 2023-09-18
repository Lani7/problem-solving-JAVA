package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 19532 수학은 비대면강의입니다
public class B19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int x = 0; int y = 0;

        // 연립방정식의 해 x , y 값 구하기
        // ax + by = c
        // dx + ey = f

        x = (c * e - b * f) / (a * e - b * d);
        y = (c * d - a * f) / (b * d - a * e);

        System.out.println(x + " " + y);

        br.close();
    }
}
