package com.lani.boj.gold;

import java.io.*;
import java.util.Stack;

// 6198 옥상 정원 꾸미기
public class G6198 {
    static class Pair {
        private int num;
        private int height;

        public Pair(int num, int height) {
            this.num = num;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        Stack<Pair> stack = new Stack<>();
        long cnt = 0;
        int idx = n;

        // 입력되는 빌딩의 높이를 배열에 저장
        for(int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < n; i++) {
            if(!stack.isEmpty()) {
                // 배열의 역순부터 비교 - 현재 높이보다 크거나 같은 top이 나오거나 스택이 빌 때까지 pop
                while(!stack.isEmpty() && arr[idx] > stack.peek().height)
                    stack.pop();

                if(stack.isEmpty())
                    cnt += n - idx;
                else
                    cnt += stack.peek().num - idx - 1;  // 거리 계산(top번호 - 현재번호 - 1)
            }
            stack.push(new Pair(idx, arr[idx--]));  // 현재 번호와 높이 push (배열의 역순)
        }

        System.out.println(cnt);

        br.close();
    }
}
