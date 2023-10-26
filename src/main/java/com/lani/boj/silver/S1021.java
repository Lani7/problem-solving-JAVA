package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 1021 회전하는 큐
public class S1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        st = new StringTokenizer(br.readLine());
        while(m-- > 0) {
            int target = Integer.parseInt(st.nextToken());

            if(deque.peek() == target)
                deque.pollFirst();
            else {
                int temp1 = 0, temp2 = 0;

                while(deque.peek() != target) {
                    deque.offerLast(deque.pollFirst()); // 왼쪽으로 한 칸씩 이동
                    temp1++;
                }

                // 움직인 횟수만큼 다시 원래대로 이동
                for (int i = 0; i < temp1; i++) {
                    deque.offerFirst(deque.pollLast());
                }

                while(deque.peek() != target) {
                    deque.offerFirst(deque.pollLast()); // 오른쪽으로 한 칸씩 이동
                    temp2++;
                }

                deque.pollFirst();  // 첫번째 원소인 target 제거

                result += (temp1 < temp2) ? temp1 : temp2;  // 두 횟수 중 작은 수를 더한다.
            }
        }

        System.out.println(result);

        br.close();
    }
}
