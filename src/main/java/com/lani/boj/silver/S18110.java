package com.lani.boj.silver;

import java.io.*;
import java.util.Arrays;

public class S18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int v = (int) Math.round(n * 0.15);
        double sum = 0.0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for (int i = v; i < n - v; i++)
            sum += arr[i];

        System.out.println( Math.round( sum / (n - 2 * v) ) );


        br.close();
    }
}
