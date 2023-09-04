package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 10994 별 찍기 - 19
public class S10994 {
    static char[][] arr;
    private static void printStar(int n, int start) {

        // base case
        if(n == 1) {
            arr[start][start] = '*';
            return;
        }

        // 배열의 어느 인덱스까지 별표를 저장할지 설정한다.
        int end = start + (n * 4 - 3); // start + len

        for (int i = start; i < end; i++) {
            for (int j = start; j < end; j++) {
                // 첫행과 마지막행에만 *을 전체 다 저장한다.
                if(i == start || i == end - 1)
                    arr[i][j] = '*';

                // 그 외의 행에는 첫 열과 마지막 열에만 *을 저장한다.
                else if(j == start || j == end - 1)
                    arr[i][j] = '*';
            }
        }

        printStar(n - 1, start + 2);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        int len = n * 4 - 3;
        arr = new char[len][len];

        // 배열 초기화
        for (int i = 0; i < arr.length; i++)
            Arrays.fill(arr[i], ' ');

        printStar(n, 0);

        for(char[] ar : arr) {
            for(char a : ar)
                sb.append(a);
            sb.append("\n");
        }

        System.out.println(sb);

        bf.close();
    }
}
