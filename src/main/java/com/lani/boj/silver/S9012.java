package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 9012 괄호
public class S9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(bf.readLine());

        for (int i = 0; i < t; i++) {
            Stack<Character> stk = new Stack<>();

            char[] chars = bf.readLine().toCharArray();

            for (int j = 0; j < chars.length; j++) {
                // 괄호 문자를 하나씩 스택에 넣는다.
                if(chars[j] == '(')
                    stk.push(chars[j]);
                else {
                    // 스택이 비어있지 않으면 pop한다.
                    if(!stk.isEmpty())
                        stk.pop();
                    // 스택이 비어있다면 스택에 저장한 후 반복문을 빠져나온다.
                    else {
                        stk.push(chars[j]);
                        break;
                    }
                }
            }

            // 스택이 비어있으면 yes, 아니면 no를 출력한다.
            if(stk.isEmpty())
                sb.append("YES").append("\n");
            else
                sb.append("NO").append("\n");
        }

        System.out.println(sb);

        bf.close();
    }
}
