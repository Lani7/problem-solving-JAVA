package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 1158 요세푸스 문제
public class S1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder("<");
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()) {
            int num = queue.poll();

            if(++temp == k) {
                sb.append(num).append(", ");
                temp = 0;
            }
            else
                queue.offer(num);

        }

        sb.delete(sb.length() - 2, sb.length()).append('>');
        System.out.println(sb);

        br.close();
    }
}
