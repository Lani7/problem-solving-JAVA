package com.lani.programmers.level1;

public class 이상한_문자_만들기 {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        // 단어를 문자 배열로 만든다.
        char[] arr = s.toCharArray();
        int cnt = 0;    // 홀짝 인덱스
        for(int i = 0; i < arr.length; i++) {
            // 공백문자일 경우
            if(arr[i] == ' ') {
                sb.append(arr[i]);
                cnt = 0;
                continue;
            }
            else {  // 공백문자가 아닐 경우
                if(cnt % 2 == 0 && (arr[i] < 'A' || arr[i] > 'Z')) {    // 짝수번째 인덱스 - 대문자로 변환
                    arr[i] -= ('a' - 'A');
                } else if(cnt % 2 != 0 && arr[i] < 'a') {
                    arr[i] += ('a' - 'A');
                }
                sb.append( arr[i] );
                cnt++;
            }
        }
        answer = sb.toString();

        return answer;
    }
}
