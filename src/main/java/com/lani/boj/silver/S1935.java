package com.lani.boj.silver;

import java.io.*;
import java.util.Stack;

// 1935 후위 표기식2
public class S1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        Stack<Double> stack = new Stack<>();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                stack.push(arr[c-'A']);
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);  break;
                    case '-':
                        stack.push(a - b);  break;
                    case '*':
                        stack.push(a * b);  break;
                    case '/':
                        stack.push(a / b);  break;
                }
            }
        }

        System.out.printf("%.2f", stack.pop());

        br.close();
    }
}
