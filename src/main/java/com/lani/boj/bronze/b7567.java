package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bf.readLine().toCharArray();
        int total = 0;    // 최종 전체 그릇 높이
        char prev = ' ';

        // ( : 정방향으로 놓인 그릇
        // ) : 거꾸로 놓인 그릇

        // 같은 방향: + 5
        // 마주보는 방향 : + 10
        // 이전의 그릇과 비교해 같은 방향인지, 마주보는 방향인지 확인한다.
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != prev)
                total += 10;
            else
                total += 5;
            prev = chars[i];
        }

        System.out.println(total);

        bf.close();
    }
}
