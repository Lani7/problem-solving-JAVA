package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new TreeMap<>();
        long max = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > max)
                max = map.get(num);
        }

        for (long key : map.keySet()) {
            if (map.get(key).longValue() == max) {
                System.out.println(key);
                break;
            }
        }

        br.close();
    }
}
