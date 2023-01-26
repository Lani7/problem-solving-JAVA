package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        // 정상에 오르기 하루 전날을 기준으로 정상까지 걸린 날짜를 계산한다
        // (x * a) - (x - 1) * b = v
        int date = (v-b) / (a-b);

        // 하루 전날 걸린 날짜와 정상의 길이가 같다면 그대로 출력하고,
        // 다르면 하루 더 걸린 것이므로 1을 더한 후 출력한다
        if((a-b) * date + b == v) {
            System.out.println(date);
        } else {
            date++;
            System.out.println(date);
        }

        bf.close();
    }

}
