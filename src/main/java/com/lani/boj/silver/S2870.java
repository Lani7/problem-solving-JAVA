package com.lani.boj.silver;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class S2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<BigInteger> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            String[] split = br.readLine().split("[^0-9]");
            for (String s : split) {
                if (!s.equals(""))
                    list.add(new BigInteger(s));
            }
        }

        Collections.sort(list);

        for (BigInteger l : list)
            sb.append(l).append('\n');

        System.out.println(sb);

        br.close();
    }
}
