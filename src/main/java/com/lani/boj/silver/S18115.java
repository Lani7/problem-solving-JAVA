package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 18115 카드 놓기
public class S18115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] skills = new int[n + 1];

        for (int i = 1; i <= n; i++)
            skills[i] = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++) {
            int skill = skills[n + 1 - i];
            switch (skill) {
                case 1:
                    deque.offerFirst(i);
                    break;
                case 2:
                    deque.offerLast(deque.pollFirst()); // 첫번째 제거 후 맨 뒤에 삽입
                    deque.offerFirst(i);                // 추가 원소를 첫번째에 삽입
                    deque.offerFirst(deque.pollLast()); // 맨 마지막을 제거 후 맨 앞에 삽입
                    break;
                case 3:
                    deque.offerLast(i);
                    break;
            }
        }

        while(!deque.isEmpty())
            sb.append(deque.poll()).append(' ');

        System.out.println(sb);

        br.close();
    }
}
