package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        set.add("ChongChong");

        while (n-- > 0) {
            String[] s = br.readLine().split(" ");
            String a = s[0];
            String b = s[1];

            if (set.contains(a))
                set.add(b);
            else if (set.contains(b))
                set.add(a);
        }

        System.out.println(set.size());

        br.close();
    }
}
