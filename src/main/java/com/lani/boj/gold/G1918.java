package com.lani.boj.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 1918 후위 표기식
public class G1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : chars) {
            // 알파벳이면 문자열에 추가
            if(Character.isAlphabetic(c)) {
                sb.append(c);
            }
            else {
                if(!stack.isEmpty()) {
                    // () 연산자
                    if(c == '(')
                        stack.push(c);
                    else if(c == ')') {
                        while(!stack.isEmpty()) {
                            Character pop = stack.pop();
                            if(pop == '(')  break;
                            sb.append(pop);
                        }
                    }
                    else if(stack.peek() == '(')
                        stack.push(c);
                    // top보다 우선순위가 높으면 스택에 push
                    else if ( (c == '*' || c == '/')
                        && (stack.peek() == '+' || stack.peek() == '-' ) )
                        stack.push(c);
                    else {
                        // top이 (가 아닐 경우인 동안 스택을 pop
                        while(!stack.isEmpty() && stack.peek() != '(') {
                            Character pop = stack.pop();
                            if(pop == '(')  break;
                            sb.append(pop);

                            // 현재 문자가 top보다 우선순위가 높으면 반복문 탈출
                            if( (c == '/' || c == '*')
                                && !stack.isEmpty()
                                && (stack.peek() == '+' || stack.peek() == '-') )
                                break;
                        }
                        stack.push(c);
                    }
                }
                // 스택이 비어 있으면 push
                else {
                    stack.push(c);
                }
            }
        }
        // 문자열 다 끝나면 스택 전부 pop
        while(!stack.isEmpty()) {
            Character pop = stack.pop();
            if(pop == '(')  continue;
            sb.append(pop);
        }

        System.out.println(sb);

        br.close();
    }
}
