package com.lani.boj;

import java.io.*;

public class Q11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int i = 2;
        while(true) {
            if(n % i == 0) {
                n /= i;
                System.out.println(i);
            }
            else i++;
            if(n == 1)  break;
        }
    }
}