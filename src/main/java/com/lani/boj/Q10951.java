package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10951 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while(null != (str = bf.readLine())){
            int idx = str.indexOf(" ");
            int a = Integer.parseInt(str.substring(0, idx));
            int b = Integer.parseInt(str.substring(idx+1));
            System.out.println(a + b);
        }

        bf.close();

    }
}
