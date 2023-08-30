package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] words = bf.readLine().split(" ");

        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            if(i == 0 && words[0].equals(""))    { continue; }
            cnt++;
        }

        System.out.println(cnt);

        bf.close();
    }
}
