package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int one = 0; // 몇번째 원인지
        int min = 0; // 범위의 최소값
        int max = 1; // 범위의 최대값

        if(n == 1) {
            System.out.println("1");
        }
        else {
            while (true) {
                one++;

                // 해당 원의 범위 구하기
                min = max + 1;
                max = min + one * 6 - 1;

                // n이 범위 사이에 있으면 one 출력한다
                if(n < min ) {
                    System.out.println(one);
                    break;
                }
//                if(n <= max && n >= min ) {
//                    System.out.println(one+1);
//                    break;
//                }

            }
        }

        bf.close();
    }
}
