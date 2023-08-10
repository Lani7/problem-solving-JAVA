package com.lani.programmers.level2;

public class 이진_변환_반복하기 {
    public int[] solution(String s) {

        int cnt = 0; // 이진변환 반복 횟수
        int removedCnt = 0; // 제거한 0의 개수
        int totalRemoved = 0; // 총 제거한 0의 개수

        String str = s;

        while(!str.equals("1")) {
            removedCnt = 0; // 제거할 0의 개수 초기화

            // 문자열의 모든 0을 제거한다. 제거할 0의 개수를 증가한다.
            char[] arr = str.toCharArray();
            for(char a : arr) {
                if(a == '0')    removedCnt++;
            }

            // 제거한 0의 개수를 누적 덧셈한다.
            totalRemoved += removedCnt;

            // 0을 제거한 문자열의 길이 (1로 이루어진 문자열의 길이)
            int ones = str.length() - removedCnt;

            // 0을 제거한 문자열의 길이를 2진법으로 표현한다.
            str = Integer.toString(ones, 2);

            cnt++;  // 반복문 실행 횟수 증가
        }

        return new int[] {cnt, totalRemoved};
    }
}
