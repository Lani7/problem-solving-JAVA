package com.lani.boj.silver;

import java.io.*;
import java.util.Stack;

// 2257 화학식량
public class S2257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        int temp = 0, result = 0;

        for(char c : chars) {
            if(c == '(')
                stack.push(0);
            else if(c == ')') {
                // initialize the temp
                temp = 0;
                while (!stack.isEmpty()) {
                    int num = stack.pop();
                    // (일 때까지 누적합한 값을 스택에 저장한다.
                    if(num == 0) {
                        stack.push(temp);
                        break;
                    }
                    else
                        temp += num;
                }
            }
            else if(c == 'H')
                stack.push(1);
            else if(c == 'C')
                stack.push(12);
            else if(c == 'O')
                stack.push(16);
            // 그 외 숫자인 경우 - 스택에서 pop 한 값과 곱한 후 스택에 저장한다.
            else
                stack.push((c - '0') * stack.pop());
        }

        while(!stack.isEmpty())
            result += stack.pop();

        System.out.println(result);

        br.close();
    }
}
