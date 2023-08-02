package com.lani.programmers.level2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

class 행렬의_곱셈Test {

    @Test
    public void test() {
        int[][] result1 = new int[][] {{15, 15}, {15, 15}, {15, 15}};
//        int[][] result2 = new int[][] {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};

        assertThat(solution(new int[][]{{1,4}, {3,2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}})).isEqualTo(result1);
//        assertThat(solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}})).isEqualTo(result2);
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        // 행렬의 곱셈은 A행렬의 행의 길이와 B행렬의 열의 길이로 이루어져 있다.
        // 행렬의 곱셈이 이루어지기 위한 조건 : A행렬의 열의 개수 = B행렬의 행의 개수
        int sum;

        for(int i = 0; i < arr1.length; i++) {  // A행렬의 행의 길이만큼 반복
            for(int j = 0; j < arr2[0].length; j++) {   // B행렬의 열의 길이만큼 반복
                sum = 0;
                for(int k = 0; k < arr2.length; k++) {  // B행렬의 행의 길이(=A행렬의 열의 길이)만큼 반복
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }

        return answer;
    }
}