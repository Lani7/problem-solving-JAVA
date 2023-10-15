package com.lani.boj.gold;

import java.io.*;
import java.util.*;

// 2493 탑
public class G2493 {
    static class Pair {
        private int height;
        private int pos;

        public Pair(int height, int pos) {
            this.height = height;
            this.pos = pos;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<Pair> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int curHeight = Integer.parseInt(st.nextToken());

            // 현재 높이보다 top(스택의 최상단)이 크거나 같은 수가 나올 때까지
            // 현재 높이가 top 보다 클 동안 스택에서 pop (현재 높이보다 작은 수는 소용 없기 때문)
            while(!stack.isEmpty() && curHeight > stack.peek().height)
                stack.pop();
            // 스택이 비어 있다면 0, 그렇지 않다면 top 을 문자열에 추가
            if(stack.isEmpty())
                sb.append(0).append(' ');
            else
                sb.append(stack.peek().pos).append(' ');

            stack.push(new Pair(curHeight, i));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
