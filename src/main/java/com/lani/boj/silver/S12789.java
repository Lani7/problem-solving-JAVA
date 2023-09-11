package com.lani.boj.silver;

import java.io.*;
import java.util.Stack;

// 12789 도키도키 간식드리미
public class S12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stk = new Stack<>();
        int order = 1;
        boolean flag = false;

        String[] s = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(s[i]);

            // 대기표 순서(order)와 스택 꼭대기에 있는 숫자가 같으면 pop
            if(!stk.isEmpty() && stk.peek() == order) {
                stk.pop();
                order++;    // 대기표 순서 증가
                i--;        // 반복문을 한 번 더 반복한다.
                continue;
            }

            // 대기표 순서(order)보다 숫자가 크면 스택에 넣는다.
            if(num > order) {
                stk.push(num);
            } else if(num == order) {
                order++;            // 순서가 일치하면 대기표 순서 증가
            }
        }

        while(!stk.isEmpty()) {
            // 스택 꼭대기에 저장된 숫자가 대기표 순서(order)와 일치하지 않을 경우
            if(stk.peek() != order) {
                flag = true;
                break;
            }
            // 일치하면 스택에서 pop, 대기표순서(order)를 증가한다.
            else {
                stk.pop();
                order++;
            }
        }

        if(!flag) System.out.println("Nice");
        else      System.out.println("Sad");

        bf.close();
    }
}
