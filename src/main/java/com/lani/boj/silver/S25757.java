package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(st.nextToken());
        String type = st.nextToken();
        int limit = 0;

        switch (type) {
            case "Y":
                limit = 1; break;
            case "F":
                limit = 2; break;
            case "O":
                limit = 3; break;
        }

        while (n-- > 0)
            set.add(br.readLine());

        System.out.println( set.size() / limit );

        br.close();
    }
}
