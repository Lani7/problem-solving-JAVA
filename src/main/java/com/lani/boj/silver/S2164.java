package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 2164 카드2
public class S2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();

        // Save at the queue
        for (int i = 1; i <= n; i++) {
            que.offer(i);
        }

        while(que.size() > 1) {
            // Remove
            que.remove();

            // End condition
            if(que.size() <= 1)  break;

            // Remove and add at the last
            que.offer(que.poll());

        }

        System.out.println(que.peek());

        br.close();
    }
}
