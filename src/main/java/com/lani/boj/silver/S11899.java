package com.lani.boj.silver;

import java.io.*;
import java.util.Stack;

// 11899 괄호 끼워넣기
public class S11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for(char c : chars) {
            if(c == '(') {
                stack.push(c);
                cnt++;
            }
            // c == ')' 일 경우
            else if(!stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
                cnt++;
            }
        }

        // 문자열 전체 길이 - 올바른 문자열의 개수
        // 올바른 문자열의 개수: cnt 에서 스택에 남아있는 개수(올바르지 못한 문자열의 개수)를 뺀다.
        System.out.println(chars.length - (cnt - stack.size()));

        br.close();
    }
}
