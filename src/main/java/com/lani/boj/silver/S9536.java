package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S9536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        String s = "";
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String str = br.readLine();

            while (true) {
                s = br.readLine();
                if (s.equals("what does the fox say?")) break;
                String[] split = s.split(" ");
                String sound = split[2];
                set.add(sound);
            }

            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                if (!set.contains(token)) {
                    sb.append(token).append(' ');
                }
            }
        }

        System.out.println(sb);

        br.close();
    }
}