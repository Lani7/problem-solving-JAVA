package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        double[] array = new double[n];
        // 평균 구하기
        double avg = 0;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        double max = 0;
        for(int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if(array[i] > max)  max = array[i];     // 최댓값 구하기
        }

        // 모든 점수 고치기
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i]/max*100;
            sum += array[i];
        }
        avg = sum / array.length;

        System.out.println(avg);

    }
}
