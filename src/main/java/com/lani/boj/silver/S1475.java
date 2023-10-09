package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1475 방 번호
public class S1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] n = br.readLine().toCharArray();

        int[] arr = new int[10];
        int max = 0;
        boolean flag = false;

        for(char c : n) {
            int idx = c - '0';

            // 숫자 6 또는 9가 사용되지 않은 경우
            if(!flag) {
                // 숫자 6 또는 9 가 주어질 경우
                if(idx == 6 || idx == 9) {
                    arr[9]++;
                    flag = true;
                }
                // 주어진 숫자가 인덱스인 배열의 값을 1 증가한다.
                else
                    arr[idx]++;
            }
            // 6 또는 9가 한번 사용되었으면서 해당 숫자(6, 9)인 경우 flag 초기화.
            else if(idx == 6 || idx == 9)
                flag = false;
            // 6 또는 9가 한번 사용되었으면서 6, 9 이외의 숫자일 경우 값을 1 증가한다.
            else
                arr[idx]++;
        }

        // 배열의 값 중에서 가장 큰 수를 찾아 출력한다.
        for(int i : arr)
            if(i > max)
                max = i;

        System.out.println(max);

        br.close();
    }
}
