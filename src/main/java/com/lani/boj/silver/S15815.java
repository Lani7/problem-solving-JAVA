package com.lani.boj.silver;

import java.io.*;
import java.util.Stack;

// 15815 천재 수학자 성필
public class S15815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        for(char c : chars) {
            // 숫자면 스택에 넣는다.
            if(c - '0' >= 0 && c - '0' <= 9) {
                stack.push(c - '0');
            }
            // 연산자면 두 개를 스택에서 꺼내 연산한 다음 결과값을 스택에 넣는다.
            else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (c) {
                    case '+': stack.push(num1 + num2); break;
                    case '-': stack.push(num1 - num2); break;
                    case '*': stack.push(num1 * num2); break;
                    case '/': stack.push(num1 / num2); break;
                }
            }
        }

        System.out.println(stack.pop());

        br.close();
    }
}
