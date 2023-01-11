package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
        int[][] arr = new int[100][100];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 각 색종이를 2차원 배열에 저장한다
            for (int j = y; j < y+10; j++) {
                for (int k = x; k < x+10; k++) {
                    arr[j][k] += 1;
                }
            }

        }

        // 색종이 넓이를 구한다
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == 1 )  sum += arr[row][col];
                else if(arr[row][col] > 1)  sum += 1;
            }
        }

        System.out.println(sum);

        bf.close();
    }
}
