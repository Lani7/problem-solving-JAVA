package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 24511 queuestack
public class S24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();  // 큐일 경우의 숫자
        int[] arr = new int[n];     // 자료구조 유형

        // 자료구조 유형(큐 : 0, 스택 : 1)을 배열에 저장한다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        // 자료구조에 들어 있는 초기 원소가 큐일 경우 덱에 저장한다.
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 큐일 경우에만 덱에 저장
            if(arr[i] == 0)
                deque.offerFirst(num);  // 앞쪽에 추가
        }

        // 삽입할 수열의 길이
        int m = Integer.parseInt(br.readLine());
        // 삽입할 수열
        st = new StringTokenizer(br.readLine(), " ");

        while (m-- > 0) {
            int num = Integer.parseInt(st.nextToken());

            deque.offer(num);   // 뒷쪽에 추가
            sb.append(deque.poll()).append(' ');    // 제일 앞쪽 원소를 삭제 후 sb에 추가

        }

        System.out.println(sb);

        br.close();
    }
}
