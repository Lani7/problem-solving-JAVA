package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3009 {
    public static int findDot(int[] arr) {
        int dot = 0;
        for (int i = 0; i < arr.length; i++) {
            // 같은 원소가 있는지 확인한다.
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
            if(arr[i] != 0) dot = arr[i];
        }
        return dot;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] recA = new int[3];
        int[] recB = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 직사각형의 좌표를 각각 배열에 넣는다.
            recA[i] = a;
            recB[i] = b;
        }

        System.out.println(findDot(recA) + " " + findDot(recB));

        bf.close();
    }
}
