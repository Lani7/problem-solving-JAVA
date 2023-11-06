package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        String prev = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++)
            arr[i] = br.readLine();

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 길이가 짧은 것부터
                if(o1.length() > o2.length())       return 1;
                // 길이가 같으면 사전 순으로
                else if(o1.length() == o2.length()) return o1.compareTo(o2);
                else                                return -1;
            }
        };

        Arrays.sort(arr, comparator);

        for (String s : arr) {
            // 중복된 단어는 하나만 남기고 제거
            if(s.equals(prev))   continue;
            sb.append(s).append('\n');
            prev = s;
        }

        System.out.println(sb);

        br.close();
    }
}
