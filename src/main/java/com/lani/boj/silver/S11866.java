package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 11866 요세푸스 문제 0
public class S11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        sb.append('<');
        while(queue.size() > 1) {
            int num = queue.poll();
            cnt++;
            if(cnt == k) {
                sb.append(num).append(", ");
                cnt = 0;
            }
            else
                queue.offer(num);
        }
        sb.append(queue.poll()).append('>');

        System.out.println(sb);

        br.close();
    }
}
