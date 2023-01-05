package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        int t;
        int time = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = (int)s.charAt(i);
            if(c >= 65 && c < 68)         t = 3;
            else if(c >= 68 && c < 71)    t = 4;
            else if(c >= 71 && c < 74)    t = 5;
            else if(c >= 74 && c < 77)    t = 6;
            else if(c >= 77 && c < 80)    t = 7;
            else if(c >= 80 && c < 84)    t = 8;
            else if(c >= 84 && c < 87)    t = 9;
            else                          t = 10;
            time += t;
        }
        System.out.println(time);

        bf.close();
    }
}
