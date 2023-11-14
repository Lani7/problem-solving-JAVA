package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> maps = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (n-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        while (m-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(maps.getOrDefault(num, 0)).append(' ');
        }

        System.out.println(sb);

        br.close();
    }
}
