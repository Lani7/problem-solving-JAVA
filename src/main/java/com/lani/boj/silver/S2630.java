package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 색종이 만들기
public class S2630 {
    static int[][] arr;
    static int whiteCnt = 0;
    static int blueCnt = 0;

    // 정사각형 안이 1 또는 0으로 가득 채워져 있는지 확인한다.
    private static void check(int n, int row, int col) {
        boolean flag = true;

        // 제일 첫 요소
        int first = arr[row][col];

        // 제일 첫 요소와 다른 요소가 등장한다면 1 또는 0으로 가득 채워져 있지 않은 것이다.
        for (int i = row; i < row+n; i++) {
            for (int j = col; j < col+n; j++) {
                if(arr[i][j] != first) {
                    flag = false;
                    break;
                }
            }
        }

        // 가득 채워져 있으면 더 분할하지 않고 개수(cnt)를 센다.
        if(flag) {
            if(first == 1)  blueCnt++;
            else            whiteCnt++;
        }
        // 가득 채워져 있지 않다면 다시 분할한다.
        else {
            // 1 ( 0, 0)
            check(n / 2, row, col);
            // 2 ( 0, n / 2 )
            check(n / 2, row, col + n / 2);
            // 3 ( n / 2, 0 )
            check(n / 2, row + n / 2, col);
            // 4 ( n / 2, n / 2)
            check(n / 2, row + n / 2, col + n / 2);

        }

    }
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        // 입력으로 들어오는 값들을 2차원 배열에 저장한다.
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        check(n, 0, 0);

        System.out.println(whiteCnt);
        System.out.println(blueCnt);


        bf.close();
    }
}
