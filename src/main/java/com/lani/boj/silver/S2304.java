package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S2304 {
    static class Pair {
        private int location;
        private int height;

        Pair(int location, int height) {
            this.location = location;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Pair[] arr = new Pair[n];
        Stack<Pair> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        boolean flag = false;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int location = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            if (height > max)   max = height;       // 가장 높은 높이를 찾는다.
            arr[i] = new Pair(location, height);
        }

        // 위치 순으로 정렬한다.
        Arrays.sort(arr, new Comparator<Pair>() {
            public int compare(Pair o1, Pair o2) {
                return o1.location - o2.location;
            }
        });

        // 가장 높은 높이를 기준으로 왼쪽과 오른쪽의 면적을 구한다.
        // 스택에 저장한다.
        for (int i = 0; i < n; i++) {
            if (arr[i].height == max) {
                if (flag) {
                    while (!stack.isEmpty() && arr[i].height > stack.peek().height)
                        stack.pop();
                }
                stack.push(arr[i]);
                flag = true;
            }
            // max 왼쪽 : 높이가 top보다 클 경우 push
            else if (!flag) {
                if (stack.isEmpty() || arr[i].height > stack.peek().height)
                    stack.push(arr[i]);
            }
            // max 오른쪽 : 높이가 top보다 작을 경우 push, 크거나 같으면 pop한 후 push
            else {
                while (!stack.isEmpty() && arr[i].height >= stack.peek().height)
                    stack.pop();
                stack.push(arr[i]);
            }
        }

        // 면적 구하기
        flag = false;
        int prevLoc = 0;
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            if (pair.height == max) {
                if (!stack.isEmpty() && pair.height == stack.peek().height)
                    sum += (pair.location - stack.peek().location) * pair.height;
                else
                    sum += pair.height;
                flag = true;
                prevLoc = pair.location;
            }
            else if (!flag) {
                sum += (pair.location - stack.peek().location) * pair.height;
            }
            else {
                sum += (prevLoc - pair.location) * pair.height;
                prevLoc = pair.location;
            }
        }

        System.out.println(sum);

        br.close();
    }
}
