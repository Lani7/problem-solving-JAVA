package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i + 1 < n && arr[i] == arr[i + 1])   continue;
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);

        br.close();
    }
}
