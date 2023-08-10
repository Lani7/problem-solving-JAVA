package com.lani.programmers.level1;

public class 문자열_내_p와_y의_개수 {
    boolean solution(String s) {
        boolean answer = true;
        int pcnt = 0;   // p의 개수
        int ycnt = 0;   // y의 개수

        s = s.toLowerCase();

        // p와 y가 모두 하나도 없는 경우는 true를 리턴한다.
        // p와 y를 포함하는 경우를 확인한다.
        if(s.contains("p") || s.contains("y")) {
            // p와 y의 개수를 비교한다.
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'p')  pcnt++;
                else if(s.charAt(i) == 'y') ycnt++;
            }
            if(pcnt != ycnt)    answer = false;
        }

        return answer;

//        // solution 2
//        s = s.toLowerCase();
//
//        // p의 개수 = 원본 s문자열 전체 길이 - p를 제외한 문자열 길이
//        int pcnt = s.length() - s.replace("p", "").length();
//        // y의 개수 = 원본 s문자열 전체 길이 - y를 제외한 문자열 길이
//        int ycnt = s.length() - s.replace("y", "").length();
//
//        return pcnt == ycnt;

    }
}
