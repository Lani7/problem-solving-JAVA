package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 7785 회사에 있는 사람
public class S7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 역순으로 정렬한다.
        Map<String, String> map = new TreeMap<>(Collections.reverseOrder());

        // 문자열을 map 에 저장한다.
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String state = st.nextToken();

            // enter 이면 map 에 저장한다.
            if(state.equals("enter"))
                map.put(name, state);

            // leave 이면 map 에서 제거한다.
            else if(state.equals("leave"))
                map.remove(name);
        }

        // 현재 회사에 있는 사람의 이름(map)을 사전 순의 역순으로 한 줄에 한 명씩 출력한다.
        map.forEach((key, value) -> {
            System.out.println(key);
        });

        br.close();
    }
}
