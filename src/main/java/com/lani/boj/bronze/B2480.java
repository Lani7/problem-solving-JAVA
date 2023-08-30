package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sb.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int prize = 0;

        if(a == b && b == c)   prize = 10000 + a * 1000;
        else if(a == b || a == c)    prize = 1000 + a * 100;
        else if(b == c)   prize = 1000 + b * 100;
        else if( a != b && b != c && a != c) {
            if(a > b && b > c || a > c && c > b)  prize = a * 100;
            else if(b > a && a > c || b > c && c > a)  prize = b * 100;
            else if(c > a && a > b || c > b && b > a)  prize = c * 100;
        }

        System.out.println(prize);
        sb.close();

    }
}
