package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder pattern = new StringBuilder(br.readLine());
        StringBuilder sb = new StringBuilder();

        int idx = pattern.indexOf("*");
        pattern.insert(idx, "[a-z]");
        pattern.insert(0, '^');
        pattern.insert(pattern.length(), '$');

        while (n-- > 0) {
            String s = br.readLine();
            boolean matches = s.matches(pattern.toString());
            if (matches)
                sb.append("DA").append('\n');
            else
                sb.append("NE").append('\n');
        }

        System.out.println(sb);

        br.close();
    }
}
