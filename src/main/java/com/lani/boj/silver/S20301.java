package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S20301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int tempK = k;
        int tempM = m;
        int num;
        boolean isReversed = false;
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++)
            deque.add(i);

        while (!deque.isEmpty()) {
            if (!isReversed)
                num = deque.pollFirst();
            else
                num = deque.pollLast();

            if (--tempK != 0) {
                if (!isReversed)
                    deque.addLast(num);
                else
                    deque.addFirst(num);
            }
            else {
                sb.append(num).append('\n');
                tempK = k;
                tempM--;
            }

            if (tempM == 0) {
                isReversed = (!isReversed) ? true : false;
                tempM = m;
            }
        }

        System.out.println(sb);

        br.close();
    }
}
