package com.lani.boj.silver;

import java.io.*;
import java.util.Arrays;

// 1427 소트인사이드
public class S1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        char[] chars = br.readLine().toCharArray();
        Arrays.sort(chars);

        for(int i = chars.length - 1; i >= 0; i--)
            sb.append(chars[i]);

        System.out.println(sb);

        br.close();
    }
}
