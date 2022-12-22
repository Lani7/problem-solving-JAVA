package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(bf.readLine());
        for(int i = 0; i < c; i++) {

            int n = 0;  // 학생의 수 초기화
            String[] str = bf.readLine().split(" ");    // 테스트 케이스
            int[] grades = new int[0];  // 학생의 점수 초기화
            int sum = 0;
            for(int k = 0; k < str.length; k++) {
                if(k==0) {
                    n = Integer.parseInt(str[k]);   // 학생의 수
                    grades = new int[n];    // 학생의 점수 배열 생성
                }
                else {
                    grades[k - 1] = Integer.parseInt(str[k]);    // 학생의 점수에 값 넣기
                    sum += grades[k-1];     // 합계 구하기
                }
            }
            double avg = sum / grades.length;
            // 특정값 / 전체값 * 100 = n%
            double cnt = 0;
            for(int g : grades) {
                if( Double.parseDouble(String.valueOf(g)) > avg ) {
                    cnt++;
                }
            }

            double percent = (cnt / grades.length) * 100;
            System.out.printf("%.3f%%\n", percent);
        }
        bf.close();
    }
}
