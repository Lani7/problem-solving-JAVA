package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int diff = 0;
        int time = Integer.MAX_VALUE;
        int height = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
                // 최대값과 최소값을 찾는다.
                if(arr[i][j] < min) min = arr[i][j];
                if(arr[i][j] > max) max = arr[i][j];
            }
        }

        // 최솟값과 최대값 사이(가능한 목표 높이)가 되도록 한다.
        for (int target = min; target <= max; target++) {
            int tempB = b;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // 1. 가장 위에 있는 블록을 제거해서 인벤토리에 넣는다.
                    // 좌표값 - 목표 높이 -> 인벤토리에 저장
                    if (arr[i][j] > target) {
                        diff = arr[i][j] - target;
                        cnt += diff * 2;    // 시간 계산
                        tempB += diff;      // 블록을 인벤토리에 저장
                    }
                    // 2. 인벤토리에 있는 블록을 좌표 위에 놓는다.
                    else if (arr[i][j] < target) {
                        diff = target - arr[i][j];
                        cnt += diff;        // 시간 계산
                        tempB -= diff;      // 블록을 인벤토리에서 꺼냄
                    }
                }
            }

            // 이전에 저장했던 time값보다 cnt가 적을 경우 값을 새로 갱신한다.
            // 시간이 같다면 target(목표 높이)값이 점점 증가되므로 최대 높이값을 갱신한다.
            if(tempB >= 0 && time >= cnt) {
                time = cnt;
                height = target;
            }
        }

        System.out.println(time + " " + height);

        br.close();
    }
}
