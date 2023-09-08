package com.lani.programmers.level2;


// 쿼드압축 후 개수 세기
public class CountingAfterQuadCompression {
    static int zeroCnt;
    static int oneCnt;

    private static void quad(int[][] arr, int row, int col, int n) {

        // 첫번째 수
        int first = arr[row][col];

        boolean flag = true;


        for(int i = row; i < row + n; i++) {
            for(int j = col; j < col + n; j++) {
                // 내부의 수가 모두 같은 값인지 확인한다.
                if(arr[i][j] != first) {
                    flag = false;
                    break;
                }
            }
        }

        // 내부의 모든 수가 같은 값이면 해당하는 수의 횟수를 센다.
        // 그렇지 않다면 4개의 정사각형으로 쪼갠 후 재귀함수를 호출해서 같은 내용을 실행한다.
        if(flag) {
            if(first == 0)
                zeroCnt++;
            else
                oneCnt++;
        } else {
            n /= 2;
            quad(arr, row, col, n);
            quad(arr, row, col + n, n);
            quad(arr, row + n, col, n);
            quad(arr, row + n, col + n, n);
        }

    }


    public int[] solution(int[][] arr) {

        quad(arr, 0, 0, arr.length);

        return new int[] {zeroCnt, oneCnt};
    }

}
