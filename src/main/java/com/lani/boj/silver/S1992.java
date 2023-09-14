package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1992 쿼드트리
public class S1992 {
    static int[][] arr;
    static StringBuilder sb;
    private static void quad(int row, int col, int n) {
        int first = arr[row][col];
        boolean flag = false;

        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if(first != arr[i][j])
                    flag = true;
            }
        }

        if(!flag)
            sb.append(first);
        else {
            n /= 2;
            sb.append('(');
            quad(row, col, n);
            quad(row, col + n, n);
            quad(row + n, col, n);
            quad(row + n, col + n, n);
            sb.append(')');
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        sb = new StringBuilder();

        quad(0, 0, n);

        System.out.println(sb.toString());

        br.close();
    }
}
