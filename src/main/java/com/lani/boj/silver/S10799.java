package com.lani.boj.silver;

import java.io.*;
import java.util.Stack;

// 10799 쇠막대기
public class S10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        Stack<Character> stk = new Stack<>();
        int sum = 0;
        char prev = ' ';

        for (int i = 0; i < chars.length; i++) {
            // (를 만나면 스택에 쌓는다.
            if(chars[i] == '(')
                stk.push(chars[i]);

            // )를 만나면 스택에서 팝한다.
            else if(chars[i] == ')') {
                stk.pop();

                // 인접 쌍 ()면(이전 문자가 '('이면) 스택에 쌓여있는 (의 갯수만큼 더한다.
                if(prev == '(')
                    sum += stk.size();
                // 인접쌍 ()이 아니면 새로운 막대기가 추가되었던 것이므로 1을 더한다.)
                else
                    sum++;
            }

            // 현재 문자를 이전 문자 변수에 저장한다.
            prev = chars[i];

        }

        System.out.println(sum);

        br.close();
    }
}
