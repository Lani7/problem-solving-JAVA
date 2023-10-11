package com.lani.boj.gold;

import java.io.*;
import java.util.Stack;

// 2504 괄호의 값
public class G2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        char prev = ' ';
        int temp = 1;
        int result = 0;
        boolean flag = false;

        for(char c : chars) {
            // 올바르지 못한 괄호열일 경우 종료
            if(!stack.isEmpty() && ( (c == ')' && stack.peek() != '(' )
                || (c == ']' && stack.peek() != '[') ) ) {
                flag = true;
                break;
            }

            if(c == '(') {
                stack.push(c);
                temp *= 2;
            }
            else if(c == '[') {
                stack.push(c);
                temp *= 3;
            }

            else if(c == ')'){
                // 이전 문자가 (이면 temp 의 값을 result 에 더한다.
                if(prev == '(')
                    result += temp;
                if(!stack.isEmpty()) {
                    stack.pop();
                    temp /= 2;
                } else {
                    // 올바르지 못한 괄호열일 경우 종료
                    flag = true;
                    break;
                }
            } else if (c == ']') {
                // 이전 문자가 [이면 temp 의 값을 result 에 더한다.
                if(prev == '[')
                    result += temp;
                if(!stack.isEmpty()) {
                    stack.pop();
                    temp /= 3;
                } else {
                    // 올바르지 못한 괄호열일 경우 종료
                    flag = true;
                    break;
                }
            }

            // 현재 문자를 이전 문자 변수에 저장한다.
            prev = c;
        }

        // 입력이 올바르지 못한 괄호열이면 0을 출력하고 아니면 괄호의 값 result 를 출력한다.
        if(flag || !stack.isEmpty())
            System.out.println("0");
        else
            System.out.println(result);

        br.close();
    }
}
