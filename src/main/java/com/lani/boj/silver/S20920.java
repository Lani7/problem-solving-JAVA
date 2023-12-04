package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            String word = br.readLine();
            if (word.length() >= m)
                map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> keySet = new ArrayList<>(map.keySet());

        Collections.sort(keySet, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (map.get(o2) != map.get(o1))
                    return map.get(o2) - map.get(o1);
                else if (o2.length() != o1.length())
                    return o2.length() - o1.length();
                else
                    return o1.compareTo(o2);
            }
        });

        for (String key : keySet)
            sb.append(key).append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
