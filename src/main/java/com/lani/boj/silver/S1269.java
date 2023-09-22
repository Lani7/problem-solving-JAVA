package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 1269 대칭 차집합
public class S1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<Integer, Boolean> map = new HashMap<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < a; i++) {
            map.put(Integer.parseInt(st.nextToken()), true);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < b; i++) {
            int ele = Integer.parseInt(st.nextToken());
            // 기존에 동일한 키가 저장되어 있다면 맵에서 제거하고, 그렇지 않다면 맵에 저장한다.
            if(map.containsKey(ele))
                map.remove(ele);
            else
                map.put(ele, true);
        }

        System.out.println(map.size());

        br.close();
    }
}
