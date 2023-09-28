package com.lani.boj.silver;

import java.io.*;
import java.util.StringTokenizer;

// 28279 덱 2
class Deque28279 {
    int[] que;
    int capacity;
    int num;
    int front;
    int rear;

    public Deque28279(int capacity) {
        this.capacity = capacity;
        que = new int [capacity];
        num = front = rear = 0;
    }

    // 1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
    public void enqueFront(int x) {
        if(num >= capacity) return;
        num++;
        if(--front < 0)
            front = capacity - 1;
        que[front] = x;
    }

    // 2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
    public void enqueRear(int x) {
        if(num >= capacity) return;
        que[rear++] = x;
        num++;
        if(rear == capacity)
            rear = 0;
    }

    // 3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    public int dequeFront() {
        if(num <= 0)    return -1;
        int x = que[front++];
        num--;
        if(front == capacity)
            front = 0;
        return x;
    }

    // 4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    public int dequeRear() {
        if(num <= 0)    return -1;
        num--;
        if(--rear < 0)
            rear = capacity - 1;
        return que[rear];
    }

    // 5: 덱에 들어있는 정수의 개수를 출력한다.
    public int size() {
        return num;
    }

    // 6: 덱이 비어있으면 1, 아니면 0을 출력한다.
    public int isEmpty() {
        return num <= 0 ? 1 : 0;
    }

    // 7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    public int peekFront() {
        if(num <= 0)    return -1;
        return que[front];
    }

    // 8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    public int peekRear() {
        if(num <= 0)    return -1;
        return que[rear == 0 ? capacity - 1 : rear - 1];
    }

}

public class S28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque28279 deque = new Deque28279(1000000);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int order = Integer.parseInt(st.nextToken());
            switch (order) {
                case 1:
                    deque.enqueFront(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.enqueRear(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    sb.append(deque.dequeFront()).append('\n');
                    break;
                case 4:
                    sb.append(deque.dequeRear()).append('\n');
                    break;
                case 5:
                    sb.append(deque.size()).append('\n');
                    break;
                case 6:
                    sb.append(deque.isEmpty()).append('\n');
                    break;
                case 7:
                    sb.append(deque.peekFront()).append('\n');
                    break;
                case 8:
                    sb.append(deque.peekRear()).append('\n');
                    break;
            }
        }

        System.out.println(sb);

        br.close();
    }
}
