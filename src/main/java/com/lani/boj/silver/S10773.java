package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 10773 제로
public class S10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());
        long sum = 0;
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(bf.readLine());

            if(n != 0)
                stk.push(n);
            else
                stk.pop();
        }

        int size = stk.size();

        for (int i = 0; i < size; i++)
            sum += stk.pop();

        System.out.println(sum);

        bf.close();
    }
}
