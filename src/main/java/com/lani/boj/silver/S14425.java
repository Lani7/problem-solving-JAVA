package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 14425 문자열 집합
public class S14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        // 주어진 문자열을 저장한다.
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 1);
        }

        // 문자열이 있는지 검사한다.
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if(map.containsKey(s))
                cnt++;
        }

        // 문자열 몇 개가 포함되어 있는지 개수를 출력한다.
        System.out.println(cnt);

        br.close();
    }
}
