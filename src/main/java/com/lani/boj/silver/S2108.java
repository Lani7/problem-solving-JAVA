package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        int[] arr = new int[n];
        int[] count = new int[n];
        List<Integer> mode = new ArrayList<>();

        double sum = 0;
        int cnt = 0, max = 0, temp = 0;

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }

        Arrays.sort(arr);

        // 산술평균. 소수점 이하 첫째 자리에서 반올림한 값
        sb.append( Math.round(sum / n) ).append('\n');

        // 중앙값
        sb.append(arr[n / 2]).append('\n');

        // 최빈값. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값
        // max 최빈값을 구한다.
        for(int i = 0; i < n; i++) {
            if(arr[i] != temp) {        // 이전(temp)과 다른 숫자일 경우
                if(cnt > max)           // max보다 크면 현 횟수를 max에 저장
                    max = cnt;
                cnt = 0;                // 횟수 초기화
            }
            cnt++;                      // 횟수 증가
            count[i] = cnt;             // 횟수를 배열에 저장한다.
            temp = arr[i];              // 현 숫자를 temp에 저장
        }
        if(cnt > max)
            max = cnt;

        // 최빈값인 인덱스를 모두 구한다.
        for(int i = 0; i < n; i++) {
            if(count[i] == max) {
                mode.add(i);
            }
        }

        // 최빈값이 하나일 경우 그 인덱스의 값을 구하고, 여러개일 경우 두 번째 인덱스의 값을 구한다.
        if(mode.size() == 1)
            sb.append(arr[mode.get(0)]).append('\n');
        else
            sb.append(arr[mode.get(1)]).append('\n');

        // 범위
        sb.append(arr[n - 1] - arr[0]);

        System.out.println(sb);

        br.close();
    }
}
