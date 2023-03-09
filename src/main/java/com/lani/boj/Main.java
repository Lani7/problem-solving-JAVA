package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n+1];
        for (int i = 1; i <= n; i++) {
            basket[i] = i;
        }

        for (int l = 0; l < m; l++) {
            StringTokenizer s = new StringTokenizer(bf.readLine(), " ");
            int i = Integer.parseInt(s.nextToken());
            int j = Integer.parseInt(s.nextToken());
            int k = Integer.parseInt(s.nextToken());

            for (int o = i; o <= j; o++) {
                 int temp = basket[i];
                 basket[i] = basket[k];
                 basket[k+o] = temp;
            }
        }

        for (int el: basket) {
            System.out.print(el + " ");
        }







        bf.close();
    }
}
