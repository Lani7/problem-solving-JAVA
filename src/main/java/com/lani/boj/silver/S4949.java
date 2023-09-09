package com.lani.boj.silver;

import java.io.*;
import java.util.Stack;

// 4949 균형잡힌 세상
public class S4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String s = bf.readLine();
            if(s.equals("."))   break;

            Stack<Character> stk = new Stack<>();
            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if(chars[i] == '(' || chars[i] == '[' ) {
                    stk.push(chars[i]);
                    continue;
                }

                // 스택이 비어있지 않은 경우 오른쪽 괄호와 짝이 맞는 왼쪽 괄호를 스택에서 pop
                else if(!stk.isEmpty()) {
                    if(chars[i] == ')' && stk.peek() == '(') {
                        stk.pop();
                        continue;
                    }
                    else if(chars[i] == ']' && stk.peek() == '[') {
                        stk.pop();
                        continue;
                    }
                }

                // 스택이 비어있든 비어있지 않든 짝이 맞지 않는 오른쪽 괄호를 스택에 push
                if(chars[i] == ')' || chars[i] == ']') {
                    stk.push(chars[i]);
                }
            }

            if(stk.isEmpty())
                sb.append("yes\n");
            else
                sb.append("no\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        bf.close();
    }
}
