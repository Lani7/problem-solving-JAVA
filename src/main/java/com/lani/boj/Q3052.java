package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for(int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(bf.readLine()) % 42;
        }
        int cnt = 1;
        for(int i = 1; i < array.length; i++) {
            cnt++;
            for(int j = 0; j < i; j++) {
                if(array[i] == array[j]) { cnt--; break;}
            }
        }
        System.out.println(cnt);

        bf.close();
    }
}
