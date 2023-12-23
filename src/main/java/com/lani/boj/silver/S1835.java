package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S1835 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = n; i > 0; i--) {
            // i번째를 덱의 맨 앞에 저장
            deque.addFirst(i);

            // 맨 뒤의 원소를 가장 앞으로 i번만큼 반복
            for (int j = 0; j < i; j++)
                deque.addFirst(deque.pollLast());
        }

        while (!deque.isEmpty())
            sb.append(deque.poll()).append(' ');

        System.out.println(sb);

        br.close();
    }
}
