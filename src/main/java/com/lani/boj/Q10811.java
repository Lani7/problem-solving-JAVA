package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int k = 0; k < m; k++) {
            String[] s = bf.readLine().split(" ");
            int i = Integer.parseInt(s[0]);
            int j = Integer.parseInt(s[1]);

            int temp[] = new int[n + 1];

            for (int l = j, o = i; l >= i; l--, o++) {
                temp[o] = arr[l];
            }

            for (int l = i; l <= j; l++) {
                arr[l] = temp[l];
            }

        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        bf.close();
    }
}
