package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2738 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] sum = new int[n][m];

        for (int k = 0; k < 2; k++) {

            for (int i = 0; i < n; i++) {
                StringTokenizer s = new StringTokenizer(bf.readLine(), " ");
                for (int j = 0; j < m; j++) {
                    if(k == 0)  a[i][j] = Integer.parseInt(s.nextToken());
                    else if(k == 1)  b[i][j] = Integer.parseInt(s.nextToken());
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        bf.close();
    }
}
