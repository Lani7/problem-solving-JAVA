package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 2346 풍선 터뜨리기
public class S2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        int[] arr = new int[n + 1];

        // 풍선의 번호를 덱에 저장한다.
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            // 풍선 안의 종이에 적혀 있는 수를 배열에 저장한다.
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        // 제일 처음에는 1번 풍선을 터뜨린다.
        int num = deque.poll();
        sb.append(num).append(' ');

        for(int k = 0; k < n - 1; k++) {
            // 풍선 번호를 인덱스로 해서 풍선 안의 종이에 적혀 있는 수를 배열에서 꺼낸다.
            // 풍선 안의 종이에 적혀있는 수만큼 deque 했다가 다시 같은 방향으로 enque 한다.
            for (int i = 0; i < Math.abs(arr[num]) - 1; i++) {
                if(arr[num] > 0) {
                    // 양수면 앞쪽부터 삭제하고 뒤쪽에 삽입
                    deque.offerLast(deque.pollFirst());
                } else {
                    // 음수면 뒤쪽부터 삭제하고 앞쪽에 삽입
                    deque.offerFirst(deque.pollLast());
                }
            }

            if(arr[num] > 0)
                num = deque.pollFirst();
            else
                num = deque.pollLast();

            sb.append(num).append(' ');
        }

        System.out.println(sb);

        br.close();
    }
}
