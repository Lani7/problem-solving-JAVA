package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 2161 카드1
public class S2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while(queue.size() > 1) {
            // 제일 위에 있는 카드를 버린다.
            sb.append(queue.poll()).append(' ');
            // 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
            queue.offer(queue.poll());
        }
        sb.append(queue.poll()).append(' ');

        System.out.println(sb);

        br.close();
    }
}
