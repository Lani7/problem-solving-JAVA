package com.lani.programmers.level1;

public class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {

        StringBuilder sb = new StringBuilder();
        sb.append(n).reverse(); // n을 sb에 넣은 다음 뒤집는다.

        char[] arr = sb.toString().toCharArray(); // string으로 변환 후 char형 배열에 저장한다.

        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i] - '0';   // char형 원소들을 문자 0과 빼기 연산을 통해 int형 숫자를 저장한다.
        }
        return answer;
    }
}
