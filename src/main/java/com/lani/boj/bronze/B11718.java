package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while( (input = bf.readLine() ) != null){
            System.out.println(input);
        }

        bf.close();
    }
}
