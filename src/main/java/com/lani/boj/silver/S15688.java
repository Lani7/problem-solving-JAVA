package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for (int i: arr)
            sb.append(i).append('\n');

        System.out.println(sb);

        br.close();
    }
}
