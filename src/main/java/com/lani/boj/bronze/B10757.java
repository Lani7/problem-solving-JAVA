package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B10757 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        BigInteger bigNumA = new BigInteger(st.nextToken());
        BigInteger bigNumB = new BigInteger(st.nextToken());

        System.out.println(bigNumA.add(bigNumB));

        bf.close();
    }
}
