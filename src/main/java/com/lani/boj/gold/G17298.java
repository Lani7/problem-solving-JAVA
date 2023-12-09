package com.lani.boj.gold;

import java.io.*;
import java.util.*;

public class G17298 {
    static class Pair {
        private int no;
        private int num;

        Pair(int no, int num) {
            this.no = no;
            this.num = num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Pair> stack = new Stack<>();
        int[] arr = new int[n];
        int[] result = new int[n];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // result 배열을 -1로 초기화
        Arrays.fill(result, -1);

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            // 스택이 비어 있거나 top보다 작거나 같을 경우 스택에 push
            if (stack.isEmpty() || arr[i] <= stack.peek().num)
                stack.push(new Pair(i, arr[i]));
            else {
                // top보다 클 경우 pop한 후 result 배열의 해당 인덱스에 큰 수를 저장
                // top이 같거나 작은 수가 나올 때까지 혹은 스택이 빌 때까지 반복
                while (!stack.isEmpty() && arr[i] > stack.peek().num)
                    result[stack.pop().no] = arr[i];
                stack.push(new Pair(i, arr[i]));
            }
        }

        for (int i : result)
            sb.append(i).append(' ');

        System.out.println(sb);

        br.close();
    }
}
