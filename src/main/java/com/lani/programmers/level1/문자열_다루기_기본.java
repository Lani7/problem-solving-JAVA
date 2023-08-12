package com.lani.programmers.level1;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {
        boolean answer = false;

        if( (s.length() == 4 || s.length() == 6)
                && s.matches("^[0-9]*$"))  answer = true;

        // 모든 문자가 숫자 : "^[0-9]*$" == "\\d+"

        return answer;
    }
}
