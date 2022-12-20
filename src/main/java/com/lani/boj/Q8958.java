package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());       // 테스트 케이스 개수
        String result;  // OX퀴즈 결과
        int sum = 0;    // 총 점수
        int cnt = 0;    // O 연속 점수
        for(int i = 0; i < n; i++) {
            result = bf.readLine();  // OX퀴즈 결과
            for(int j = 0; j < result.length(); j++) {
                if(result.charAt(j) == 'O') {
                    cnt++;      // O를 맞을 때마다 연속점수 1증가
                    sum += cnt; // 합계에 점수 더하기
                }
                else    cnt = 0;
            }
            System.out.println(sum);
            cnt = 0;    // 연속 점수 초기화
            sum = 0;    // 총 점수 초기화
        }
        bf.close();
    }
}
