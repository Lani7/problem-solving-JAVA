package com.lani.boj.gold;

import java.io.*;
import java.util.*;

public class G5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        boolean isError = false;
        boolean isReverse = false;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            char[] p = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), ",[]");
            Deque<Integer> deque = new ArrayDeque<>();

            for (int i = 0; i < n; i++)
                deque.add(Integer.parseInt(st.nextToken()));

            for (int i = 0; i < p.length; i++) {
                if (isError)  break;
                switch (p[i]) {
                    case 'R' :
                        isReverse = (!isReverse) ? true : false;
                        break;
                    case 'D' :
                        if (deque.isEmpty())    isError = true;
                        else {
                            if (!isReverse)
                                deque.pollFirst();
                            else
                                deque.pollLast();
                        }
                        break;
                }
            }

            if (isError)
                sb.append("error").append('\n');
            else {
                sb.append('[');
                while (!deque.isEmpty()) {
                    if (!isReverse)
                        sb.append(deque.pollFirst());
                    else
                        sb.append(deque.pollLast());
                    if (!deque.isEmpty())
                        sb.append(',');
                }
                sb.append(']').append('\n');
            }

            isError = false;
            isReverse = false;
        }

        System.out.println(sb);

        br.close();
    }
}
