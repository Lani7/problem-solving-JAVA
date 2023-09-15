package com.lani.boj.bronze;

import java.io.*;
import java.util.*;

// 2798 블랙잭
public class B2798 {
    private static int n, m, sum, result;
    private static int[] arr;
//    private static boolean[] flag;
    private static void dfs(int idx, int start, int sum) {

        // base case
        if(idx == 3) {
            // sum값과 result를 비교해서 큰 값을 result에 저장한다.
            if(sum > result && sum <= m)
                result = sum;
            return;
        }

        // recursion
        for (int i = start; i < n; i++) {
            dfs(idx + 1, i + 1, sum + arr[i]);

//            if(!flag[i]) {
//                flag[i] = true;
//                dfs(idx + 1, sum + arr[i]);
//                flag[i] = false;
//            }

         }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        StringTokenizer cards = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(cards.nextToken());
        }

//        flag = new boolean[n];
        dfs(0, 0, 0);

        System.out.println(result);



//        int sum = 0;
//        for (int i = 0; i < arr.length-2; i++) {
//            for (int j = i + 1; j < arr.length-1; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    int temp = arr[i] + arr[j] + arr[k];
//                    if(temp > sum && temp <= m)
//                        sum = temp;
//                }
//            }
//        }
//        System.out.println(sum);

        br. close();
    }
}
