package com.lani.boj.silver;

import java.io.*;

public class S1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String word = br.readLine();
        int len = word.length();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + len > s.length())  break;
            if (s.substring(i, i + len).equals(word)) {
                cnt++;
                i += len - 1;
            }
        }

        System.out.println(cnt);

        br.close();
    }
}
