package com.lani.boj.silver;

import java.io.*;
import java.util.StringTokenizer;

// 10828 스택
class Stack10828 {
    int[] stk;
    int capacity;
    int ptr;

    public Stack10828(int maxLen) {
        this.capacity = maxLen;
        stk = new int[capacity];
        ptr = 0;
    }

    // push X: 정수 X를 스택에 넣는 연산이다.
    public void push(int x) {
        stk[ptr++] = x;
    }

    // pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.
    // 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int pop() {
        if(ptr > 0)
            return stk[--ptr];
        else
            return -1;
    }

    // size: 스택에 들어있는 정수의 개수를 출력한다.
    public int size() {
        return ptr;
    }

    // empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    public int empty() {
        if(ptr <= 0) {
            return 1;
        }
        else return 0;
    }

    // top: 스택의 가장 위에 있는 정수를 출력한다.
    // 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int top() {
        if(ptr <= 0)
            return -1;
        else
            return stk[ptr - 1];
    }

}

public class S10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());

        Stack10828 stk = new Stack10828(100000);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            String order = st.nextToken();
            switch (order) {
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    stk.push(num);
                    break;
                case "pop" :
                    sb.append(stk.pop()).append('\n');
                    break;
                case "size" :
                    sb.append(stk.size()).append('\n');
                    break;
                case "empty" :
                    sb.append(stk.empty()).append('\n');
                    break;
                case "top" :
                    sb.append(stk.top()).append('\n');
                    break;
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        bf.close();
    }
}
