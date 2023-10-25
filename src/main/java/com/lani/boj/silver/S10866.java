package com.lani.boj.silver;

import java.io.*;
import java.util.StringTokenizer;

class Deque10866 {
    int[] deque;
    int capacity;
    int front;
    int rear;
    int num;

    public Deque10866(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = rear = num = 0;
    }

    public void push_front(int x) {
        if(num >= capacity) return;
        num++;
        if(--front < 0)
            front = capacity - 1;
        deque[front] = x;
    }

    public void push_back(int x) {
        if(num >= capacity) return;
        deque[rear++] = x;
        num++;
        if(rear == capacity)
            rear = 0;
    }

    public int pop_front() {
        if(num <= 0)    return -1;
        int x = deque[front++];
        num--;
        if(front == capacity)
            front = 0;
        return x;
    }

    public int pop_back() {
        if(num <= 0)    return -1;
        num--;
        if(--rear < 0)
            rear = capacity - 1;
        return deque[rear];
    }

    public int size() {
        return num;
    }

    public int empty() {
        if(num <= 0)    return 1;
        else            return 0;
    }

    public int front() {
        if(num <= 0)    return -1;
        return deque[front];
    }

    public int back() {
        if(num <= 0)    return -1;
        return deque[rear == 0 ? capacity - 1: rear - 1];
    }
}

public class S10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque10866 deque = new Deque10866(10000);
        StringBuilder sb = new StringBuilder();
        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            switch (order) {
                case "push_front":
                    deque.push_front(Integer.parseInt(st.nextToken())); break;
                case "push_back":
                    deque.push_back(Integer.parseInt(st.nextToken()));  break;
                case "pop_front":
                    sb.append(deque.pop_front()).append('\n');  break;
                case "pop_back":
                    sb.append(deque.pop_back()).append('\n');    break;
                case "size":
                    sb.append(deque.size()).append('\n');   break;
                case "empty":
                    sb.append(deque.empty()).append('\n');  break;
                case "front":
                    sb.append(deque.front()).append('\n');  break;
                case "back":
                    sb.append(deque.back()).append('\n');   break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
