package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Boolean> map = new HashMap<>();
        int cnt = 0;

        while (n-- > 0) {
            String s = br.readLine();
            if (s.equals("ENTER"))
                map = new HashMap<>();
            else {
                map.putIfAbsent(s, true);
                if (map.get(s)) {
                    cnt++;
                    map.put(s, false);
                }
            }
        }

        System.out.println(cnt);

        br.close();
    }
}
