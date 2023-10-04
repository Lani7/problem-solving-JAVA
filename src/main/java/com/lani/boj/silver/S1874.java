package com.lani.boj.silver;

import java.io.*;
import java.util.Stack;

// 1874 스택 수열
public class S1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            // 만들어야 하는 수열을 배열에 저장한다.
            arr[i] = Integer.parseInt(br.readLine());
        }

        int i = 1;      // n 까지의 숫자
        int idx = 0;    // 수열 배열의 인덱스

        // 1부터 n 까지의 숫자를 스택에 넣었다가 뽑는다.
        while (true) {
            // 수열을 만든 경우의 종료조건 : 수열 배열의 끝 요소까지 다 돌았으면 반복문을 빠져나온다.
            if(idx == n)    break;
            // 불가능한 경우의 종료 조건 :
            // n까지 숫자를 다 넣었으면서, 스택 최상단과 수열이 일치하지 않는 경우 종료
            if(i > n && stack.peek() != arr[idx])   break;

            // 스택의 최상단에 있는 숫자가 수열의 숫자와 같으면 뽑고(pop), 아니면 넣는다.(push)
            if(!stack.isEmpty() && stack.peek() == arr[idx]) {
                stack.pop();
                idx++;          // 수열 배열의 인덱스 증가 (다음 원소를 비교해야 하기 때문)
                sb.append('-').append('\n');
            }
            else {
                stack.push(i++);    // 스택에 push 한 후, n 까지 넣을 다음 숫자를 1만큼 증가
                sb.append('+').append('\n');
            }
        }

        // 스택이 비어있으면 추가된 문자열 표현을 출력하고, 아니면 NO를 출력한다.
        if(stack.isEmpty())
            System.out.println(sb);
        else
            System.out.println("NO");

        br.close();
    }
}
