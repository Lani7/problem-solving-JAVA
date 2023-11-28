package com.lani.boj.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class B1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (num-- > 0) {
            int input = Integer.parseInt(st.nextToken());
            if (input > max)    max = input;
            if (input < min)    min = input;
        }

        if (num == 1)
            System.out.println(Math.pow(min, min));
        else
            System.out.println(min * max);

        br.close();
    }
}
