package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        for (int i = 0; i < t; i++) {
            String s = bf.readLine();
            String[] split = s.split("");
            System.out.println(split[0] + split[split.length-1]);
        }

        bf.close();
    }
}
