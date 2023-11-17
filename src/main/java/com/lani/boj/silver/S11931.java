package com.lani.boj.silver;

import java.io.*;
import java.util.Arrays;

public class S11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr, (num1,num2)->num2-num1);

        Arrays.stream(arr).forEach(x-> sb.append(x).append('\n'));

        System.out.println(sb);

        br.close();
    }
}
