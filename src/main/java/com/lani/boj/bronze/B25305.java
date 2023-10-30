package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25305 커트라인
public class B25305 {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    static void bubbleSort(int[] arr) {
        int k = 0;
        while(k < arr.length - 1) {
            int last = arr.length - 1;
            for (int i = last; i > k; i--) {
                if(arr[i - 1] < arr[i]) {
                    swap(arr, i - 1, i);
                    last = i;
                }
            }
            k = last;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        bubbleSort(arr);

        System.out.println(arr[k - 1]);

        br.close();
    }
}
