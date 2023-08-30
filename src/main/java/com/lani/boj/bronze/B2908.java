package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int a = 0;
        int b = 0;

        while(st.hasMoreTokens()) {
            b = a;
            String s = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for (int i = (s.length()-1); i >= 0 ; i--) {
                sb.append(s.charAt(i));
            }
            a = Integer.parseInt(sb.toString());
        }
        System.out.println( a > b? a : b);

        bf.close();
    }
}
