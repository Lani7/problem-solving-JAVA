package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 1620 나는야 포켓몬 마스터 이다솜
public class S1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n+1];
        Map<String, Integer> map = new HashMap<>();

        // 배열과 HashMap 에 각각 저장한다.
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            arr[i] = name;              // index 순서대로 문자열(포켓몬 이름)을 저장
            map.put(name, i);           // key : 문자열(포켓몬 이름), value : 숫자
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            // 숫자(index) -> 포켓몬 이름 출력
            if(input.matches("\\d*"))
                sb.append(arr[Integer.parseInt(input)]).append('\n');
            // 포켓몬 이름(key) -> 숫자(value) 출력
            else
                sb.append(map.get(input)).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
