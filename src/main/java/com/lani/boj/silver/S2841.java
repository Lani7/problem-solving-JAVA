package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 2841 외계인의 기타 연주
public class S2841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        Stack<Integer>[] stacks = new Stack[6];
        for (int i = 0; i < 6; i++) {
            stacks[i] = new Stack<>();
        }

        int cnt = 0;

        while(n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int type = Integer.parseInt(st.nextToken()) - 1;
            int num = Integer.parseInt(st.nextToken());

            // 스택이 비거나 num보다 작거나 같은 수의 top이 나올 때까지 pop
            while(!stacks[type].isEmpty() && num < stacks[type].peek()) {
                stacks[type].pop();
                cnt++;
            }

            // num과 top이 동일하면 반복을 건너뛴다.
            if(!stacks[type].isEmpty() && num == stacks[type].peek())
                continue;

            // type에 따라 스택 배열에 저장한다.
            stacks[type].push(num);
            cnt++;
        }

        System.out.println(cnt);

        br.close();
    }
}
