package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
        int[] array = new int[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
            if(array[i] < x) System.out.print(array[i] + " ");
        }

    }

}
