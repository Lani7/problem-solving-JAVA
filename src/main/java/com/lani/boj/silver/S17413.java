package com.lani.boj.silver;

import java.io.*;
import java.util.Stack;

// 17413 단어 뒤집기 2
public class S17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();

        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        char[] chars = s.toCharArray();
        boolean flag = false;

        for(int i = 0; i < chars.length; i++) {

            // 태그는 그대로 문자열에 붙인다.
            if(chars[i] == '<') {
                flag = true;
                // 태그 이전의 문자열을 스택에서 pop
                while (!stk.isEmpty()) {
                    sb.append(stk.pop());
                }
            } else if(chars[i] == '>') {
                flag = false;
                sb.append(chars[i]);
                continue;
            }

            if(flag) {
                sb.append(chars[i]);
            }
            // 태그 외의 문자열일 경우
            else {
                // 공백이면 스택에 있던 문자들 팝해서 문자열에 이어 붙인다.
                if(chars[i] == ' ') {
                    while (!stk.isEmpty()) {
                        sb.append(stk.pop());
                    }
                    sb.append(' ');
                } else
                    stk.push(chars[i]);

                // 마지막 문자일 경우 스택에 있는 문자들을 pop
                if(i == chars.length - 1 ) {
                    while (!stk.isEmpty()) {
                        sb.append(stk.pop());
                    }
                }
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        bf.close();
    }
}
