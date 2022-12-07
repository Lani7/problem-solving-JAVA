package com.lani.boj;

import java.io.*;

public class Q2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++ ) {
            for(int j = i; j < n-1; j++) {
                bw.write(" ");
            }
            for(int k = 0; k < i+1; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bf.close();
        bw.flush();
        bw.close();
    }
}
