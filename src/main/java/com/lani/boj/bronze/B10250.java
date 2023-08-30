package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());   // 층 수
            int w = Integer.parseInt(st.nextToken());   // 방 수
            int n = Integer.parseInt(st.nextToken());   // n번째 손님
            int a = 0;  // 층
            int b = 0;  // 호
            if(n % h != 0) {
                a = n % h;
                b = n / h + 1;
            } else {
                a = h;
                b = n / h;
            }
            // n번째 손님에게 배정되어야 하는 방 번호 출력
            if(b < 10) System.out.println(a + "0" + b);
            else System.out.println(a + "" + b);
        }

        bf.close();
    }
}
