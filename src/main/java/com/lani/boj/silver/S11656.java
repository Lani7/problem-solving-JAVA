package com.lani.boj.silver;

import java.io.*;
import java.util.Arrays;

public class S11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++)
            arr[i] = s.substring(i);

        Arrays.sort(arr);

        for (String a : arr)
            sb.append(a).append('\n');

        System.out.println(sb);

        br.close();
    }
}
