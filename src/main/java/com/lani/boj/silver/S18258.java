package com.lani.boj.silver;

import java.io.*;
import java.util.StringTokenizer;

// 18258 큐 2
// 정수를 저장하는 큐
class Queue18258 {

    int[] que;
    int capacity;
    int num;
    int front;
    int rear;

    public Queue18258(int capacity) {
        this.capacity = capacity;
        que = new int[capacity];
        num = front = rear = 0;
    }

    // push X: 정수 X를 큐에 넣는 연산이다.
    public void push(int x) {
        // 만원이면 메서드 종료
        if(num >= capacity)
            return;
        que[rear++] = x;
        num++;
        if(rear == capacity)
            rear = 0;
    }

    // pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int pop() {
        if(num <= 0)
            return -1;
        int x = que[front++];
        num--;
        if(front == capacity)
            front = 0;
        return x;
    }

    // size: 큐에 들어있는 정수의 개수를 출력한다.
    public int size() {
        return num;
    }

    // empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
    public int empty() {
        return (num <= 0) ? 1 : 0;
    }

    // front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int front() {
        if(num <= 0)
            return -1;
        return que[front];
    }

    // back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int back() {
        if(num <= 0)
            return -1;
        return que[rear - 1];
    }

}

public class S18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue18258 q = new Queue18258(2000000);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            switch (order) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    q.push(x);
                    break;
                case "pop":
                    sb.append(q.pop()).append('\n');
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    sb.append(q.empty()).append('\n');
                    break;
                case "front":
                    sb.append(q.front()).append('\n');
                    break;
                case "back":
                    sb.append(q.back()).append('\n');
                    break;
            }
        }

        System.out.println(sb);

        br.close();
    }
}
