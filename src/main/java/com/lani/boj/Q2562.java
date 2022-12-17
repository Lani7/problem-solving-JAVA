package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int[] array = new int[9];
        int cnt = 0;
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            if(array[i] > max)   {
                max = array[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
        bf.close();
    }
}
