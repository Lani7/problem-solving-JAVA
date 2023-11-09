package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0, temp = 0;
        int[] arr = new int[n];
        int[] origin = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            origin[i] = num;
        }

        Arrays.sort(arr);

        // 정렬 순으로 cnt 증가
        for(int i : arr) {
            // 이때 이전 값과 같으면 중복된 수이므로 반복을 건너뛰기
            if(i == temp)   continue;

            map.put(i, cnt);

            cnt++;
            temp = i;
        }

        for(int i : origin)
            sb.append(map.get(i)).append(' ');

        System.out.println(sb);

        br.close();
    }
}
