package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        // x와 w, y와 h 사이의 거리를 구한다 (절대값)
        int xw = Math.abs(x - w);
        int yh = Math.abs(y - h);

        // x와 w, y와 h 사이의 거리 중 작은 수를 구한다
        int d = xw < yh ? xw : yh;

        // 만약 점들 사이의 거리보다 원점에서의 x, y의 값이 작으면 x, y중 작은 수를 출력하고
        // 아니면 d를 출력한다
        if(d > x || d > y) System.out.println(x < y ? x : y);
        else               System.out.println(d);

        bf.close();
    }
}
