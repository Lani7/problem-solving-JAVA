package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1018 체스판 다시 칠하기
public class S1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];
        int cnt = 0;
        int result = Integer.MAX_VALUE;

        // 주어진 보드를 2차원 배열에 담는다.
        for (int i = 0; i < n; i++) {
            String[] colors = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                board[i][j] = colors[j].charAt(0);
            }
        }

        char first;     // 제일 왼쪽 위에 있는 첫번째 사각형
        for (int r = 0; r < 2; r++) {
            // 첫 사각형이 검은색(B)인지 흰색(W)인지에 따라 경우의 수를 구한다.
            if(r == 0)  first = 'B';
            else first = 'W';

            // 보드의 한 변의 길이에서 8x8의 정사각형(체스판)을 구할 수 있는 경우의 수를 구한다.
            for (int k = 0; k + 8 <= n; k++) {
                for (int l = 0; l + 8 <= m; l++) {

                    // 각각의 8x8 정사각형 내에서 칠해야 하는 최소 정사각형의 개수를 구한다.
                    for (int i = k; i < k + 8; i++) {
                        for (int j = l; j < l + 8; j++) {

                            // 첫 시작점을 기준으로 홀수번째의 행일 경우 칠해야 하는 정사각형 개수를 증가시킨다.
                            if( i % 2 == 1 ) {
                                // Should be the first color
                                if( j % 2 == 1 && board[i][j] != first)
                                    cnt++;
                                // should be the different color
                                else if( j % 2 == 0 && board[i][j] == first )
                                    cnt++;
                            }
                            // 첫 시작점을 기준으로 짝수번째의 행일 경우 칠해야 하는 정사각형 개수를 증가시킨다.
                            else {
                                // Should be the different color
                                if( j % 2 == 1 && board[i][j] == first)
                                    cnt++;

                                // Should be the first color
                                else if( j % 2 == 0 && board[i][j] != first )
                                    cnt++;
                            }
                        }
                    }

                    // 이전의 최소 개수(result)와 비교해서 더 적으면 result 변수에 cnt 개수를 저장한다.
                    if(result > cnt)    result = cnt;

                    cnt = 0;        // cnt 초기화
                }
            }
        }

        System.out.println(result);

        br.close();
    }
}
