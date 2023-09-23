package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 11478 서로 다른 부분 문자열의 개수
public class S11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Set<String> set = new HashSet<>();

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j + i <= s.length(); j++)
                set.add(s.substring(j, j + i));
        }

        System.out.println(set.size());

        br.close();
    }
}
