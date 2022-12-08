package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int idx;
        int a;
        int b;
        while (true) {
            String str = bf.readLine();
            idx = str.indexOf(" ");
            a = Integer.parseInt(str.substring(0, idx));
            b = Integer.parseInt(str.substring(idx+1));
            if(a == 0 && b == 0)   { break; }
            sb.append(a + b + "\n");
        }
            System.out.println(sb.toString());
    }
}
