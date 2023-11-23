package com.lani.boj.silver;

import java.util.Arrays;
import java.util.Scanner;

public class S5648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String token = sc.next();
            StringBuilder tmp = new StringBuilder(token).reverse();
            arr[i] = Long.parseLong(tmp.toString());
        }

        Arrays.sort(arr);

        for (long a : arr)
            sb.append(a).append('\n');

        System.out.println(sb);



    }
}
