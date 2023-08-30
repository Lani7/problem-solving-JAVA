package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] submitted = new int[28];
        for(int i = 0; i < 28; i++) {
            submitted[i] = Integer.parseInt(bf.readLine());
        }

        int s = 0;
        for(int i = 1; i <= 30; i++) {
            for(int j = 0; j < submitted.length; j++) {
                if(submitted[j] == i) {
                    System.out.println(i + " submitted");
                    s = i;
                }
            }
            if(s != i) {
                s = i;
                System.out.println(s);
            }

        }
        bf.close();
    }
}
