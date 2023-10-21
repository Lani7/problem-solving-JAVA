package com.lani.boj.silver;

import java.io.*;
import java.util.StringTokenizer;

// 10845 큐
class Queue10845 {
    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    public Queue10845(int capacity) {
        this.capacity = capacity;
        que = new int[capacity];
        front = rear = num = 0;
    }

    public void push(int x) {
        if(num >= capacity) return;
        que[rear++] = x;
        if(rear == capacity)
            rear = 0;
        num++;
    }

    public int pop() {
        if(num <= 0)    return -1;
        int x = que[front++];
        num--;
        if(front == capacity)
            front = 0;
        return x;
    }

    public int size() {
        return num;
    }

    public int empty() {
        if(num <= 0)    return 1;
        else            return 0;
    }

    public int front() {
        if(num <= 0)  return -1;
        return que[front];
    }

    public int back() {
        if(num <= 0)  return -1;
        if(num == capacity)
            return que[0];
        else
            return que[rear - 1];
    }
}

public class S10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue10845 queue = new Queue10845(10000);
        StringBuilder sb = new StringBuilder();

        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            switch (order) {
                case "push":
                    queue.push(Integer.parseInt(st.nextToken())); break;
                case "pop":
                    sb.append(queue.pop()).append('\n');      break;
                case "size":
                    sb.append(queue.size()).append('\n');     break;
                case "empty":
                    sb.append(queue.empty()).append('\n');    break;
                case "front":
                    sb.append(queue.front()).append('\n');    break;
                case "back":
                    sb.append(queue.back()).append('\n');     break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
