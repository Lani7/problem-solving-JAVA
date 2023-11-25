package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());

        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });


        for (int key : keySet) {
            for (int i = 0; i < map.get(key); i++)
                sb.append(key).append(' ');
        }

        System.out.println(sb);

        br.close();
    }
}
