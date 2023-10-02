package com.lani.boj.silver;

import java.io.*;
import java.util.Stack;

// 3986 좋은 단어
public class S3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(n-- > 0) {
            char[] chars = br.readLine().toCharArray();
            Stack<Character> stk = new Stack<>();

            for (int i = 0; i < chars.length; i++) {
                // 스택의 최상단에 있는 문자와 현재 문자가 같지 않다면 스택에 추가한다.
                if(stk.isEmpty() || chars[i] != stk.peek())
                    stk.push(chars[i]);
                // 같은 문자라면 스택에서 제거한다.
                else
                    stk.pop();
            }

            // 스택이 비어 있다면 좋은 단어이므로 개수를 1 증가한다.
            if(stk.isEmpty())
                cnt++;
        }

        System.out.println(cnt);

        br.close();
    }
}
