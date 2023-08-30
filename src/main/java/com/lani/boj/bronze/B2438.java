package com.lani.boj.bronze;

import java.io.*;

public class B2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

//        for(int i = 1; i <= n; i++) {
//            for(int j = 0; j < i; j++) {
//                bw.write("*");
//            }
//            bw.write("\n");
//        }


        bf.close();
        bw.flush();
        bw.close();
    }
}
