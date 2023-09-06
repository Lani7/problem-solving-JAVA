package com.lani.boj.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 2447 별찍기 - 10
public class G2447 {
    static char[][] arr;
    static void getSpace(int n, int x, int y) {

        // base case
        if(n == 1) {
            return;
        }

        int section = n / 3;

        // 가운데를 공백으로 저장한다.
        for (int i = section; i < section * 2; i++) {
            for (int j = section; j < section * 2 ; j++) {
                arr[x + i][y + j] = ' ';
            }
        }

        // 3 * 3 구역으로 나눠 재귀함수를 호출한다.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // 가운데 구역은 건너뛴다.
                if(i == 1 && j == 1)    continue;

                getSpace(n / 3, x + (section * i) , y + (section * j) );
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        arr = new char[n][n];

        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], '*');
        }


        getSpace(n, 0, 0);


        for(char[] ar : arr) {
            for(char a : ar)
                sb.append(a);
            sb.append('\n');
        }

        System.out.println(sb);

        bf.close();
    }
}
