package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;
            int num = 0;
            int[] arr = new int[n];     // 문서의 중요도
            Queue<Integer> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < n; i++) {
                queue.add(i);
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // 최대값 구하기, 더 높은 우선순위가 있는지(flag) 확인
            while (!queue.isEmpty()) {
                int maxIdx = 0;
                int max = 0;
                boolean flag = true;
                for (int i = 0; i < arr.length; i++) {
                    if (max < arr[i]) {
                        max = arr[i];
                        maxIdx = i;
                    }
                    if (arr[i] == -1)   continue;
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == -1)   continue;
                        if (arr[j] != arr[i])
                            flag = false;
                    }
                }

                // 더 높은 우선순위가 있을 경우
                if (!flag) {
                    num = queue.poll();
                    while (arr[num] != arr[maxIdx]) {
                        queue.add(num);
                        num = queue.poll();
                    }
                }

                cnt++;
                // 더 높은 우선순위가 없을 경우
                if (flag)
                    num = queue.poll();

                arr[num] = -1;      // poll한 문서의 중요도를 -1로 저장

                if (num == m) {
                    sb.append(cnt).append('\n');
                    break;
                }
            }
        }

        System.out.println(sb);

        br.close();
    }
}
