package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 28278 스택 2

class Stack {
    int[] stk;
    int capaticy;
    int ptr = 0;

    public Stack(int maxLen) {
        this.capaticy = maxLen;
        stk = new int[maxLen];
    }

    // 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
    public void push(int x) {
        if(ptr < capaticy)
           stk[ptr++] = x;
    }

    // 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    public int pop() {
        // 스택에 정수가 있을 경우
        if(ptr > 0) {
            return stk[--ptr];
        } else {        // 스택에 없을 경우
            return -1;
        }
    }

    // 3: 스택에 들어있는 정수의 개수를 출력한다.
    public int count() {
        return ptr;
    }

    // 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
    public int isEmpty() {
        if(ptr <= 0) {
            return 1;
        } else {
            return 0;
        }
    }

    // 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    public int peek() {
        if(ptr > 0) {
            return stk[ptr-1];
        } else {
            return -1;
        }
    }

    // stack 데이터 출력
    public void dump() {
        System.out.print("ptr : " + ptr + ", [data] : ");
        for (int i = 0; i < ptr; i++) {
            System.out.print( stk[i] + " ");
        }
        System.out.println();
    }

}

public class S28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        Stack s = new Stack(1000000);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int order = Integer.parseInt(st.nextToken());

            switch (order) {
                case 1 :
                    int x = Integer.parseInt(st.nextToken());
                    s.push(x);
                    break;
                case 2 :
                    sb.append(s.pop()).append('\n');
                    break;
                case 3 :
                    sb.append(s.count()).append('\n');
                    break;
                case 4 :
                    sb.append(s.isEmpty()).append('\n');
                    break;
                case 5 :
                    sb.append(s.peek()).append('\n');
                    break;
            }
        }

        System.out.println(sb);
        bf.close();
    }
}
