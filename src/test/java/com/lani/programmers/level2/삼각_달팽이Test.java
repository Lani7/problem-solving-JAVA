package com.lani.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class 삼각_달팽이Test {

    @Test
    public void test() {
//        assertThat(solution(4)).containsExactly(1,2,9,3,10,8,4,5,6,7);
//        assertThat(solution(5)).containsExactly(1,2,12,3,13,11,4,14,15,10,5,6,7,8,9);
//        assertThat(solution(6)).containsExactly(1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11);
        assertThat(solution(7)).containsExactly(1,2,18,3,19,17,4,20,27,16,5,21,28,26,15,6,22,23,24,25,14,7,8,9,10,11,12,13);
//        assertThat(solution(1));
//        assertThat(solution(2));

//        for (int i = 1; i <= 1000; i++) {
//            assertThat(solution(i));
//        }

//        assertThat(solution(new String[]{"XXX", "XXX", "XXX"})).containsExactly(-1);
    }


    public int[] solution(int n) {
        int[] answer;
        if(n == 1)  return answer = new int[]{1};

        // 1. 배열 만들기
        int[][] arr = new int[n][n];
        int num = 0;
        int cnt = 0;

        // 2. 배열에 숫자 집어넣기
        // 각 행의 첫번째 열과 마지막 행에 숫자를 넣는다.
        for(int i = 0; i < n; i++) {
            arr[i][0] = ++num;
            if(i == n-1) {
                for(int j = 1; j < n; j++)
                    arr[i][j] = ++num;
            }
        }

        cnt += 2;

        int re = 2;
        int re2 = 2;
        int j1 = n - 1;
        int j2 = 1;
        int c = 0; // zigzag count
        while(true) {
            if(cnt == n)    break;

            // 맨 마지막-1 행부터 거꾸로 +1씩 숫자가 증가. 오른쪽 위로.
            for(int i = arr.length - re; i > c; i--) {
                arr[i][j1] = ++num;
            }
            j1--;
            c++;
            cnt++;
            if(cnt == n)    break;

            // 왼쪽 아래로.
            int temp = re2;
            for(int i = re; i < arr.length - c; i++) {
                arr[temp++][j2] = ++num;
            }
            re2 += 2;
            j2++;
            c++;
            cnt++;

            if(cnt != n) {
                int i = arr.length - re;
                // 왼쪽에서 오른쪽으로
                for(int jj = re+1; jj <= arr[i].length - c; jj++) {
                    arr[i][jj] = ++num;
                }
                re++;
                cnt++;
            }
        }

        int sum = n * (n+1) / 2;

        answer = new int[sum];

        int an = 0;
        for(int[] ar : arr) {
            for(int a : ar) {
                if(a != 0) {
                    answer[an] = a;
                    an++;
                }
            }
        }

        return answer;
    }
}
