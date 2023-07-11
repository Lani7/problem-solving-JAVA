package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int remainder = 0;
        while(n > 0) {
            remainder = n % b;
            n /= b;
            if(remainder > 9) {
                char c = (char)(remainder + 55);
                sb.append(c);
            }
            else    sb.append(remainder);
        }
        System.out.println(sb.reverse());
        bf.close();
    }
}
