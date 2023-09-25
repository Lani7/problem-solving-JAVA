package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 1764 듣보잡
public class S1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        TreeMap<String, Boolean> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map.put(name, false);
        }

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if(map.containsKey(name)) {
                map.put(name, true);
                cnt++;
            }
        }

        map.forEach((key, value) -> {
            if(value)
                sb.append(key).append('\n');
        });

        System.out.println(cnt);
        System.out.println(sb);

        br.close();
    }
}
