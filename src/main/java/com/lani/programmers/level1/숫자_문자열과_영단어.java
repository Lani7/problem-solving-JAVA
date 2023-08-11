package com.lani.programmers.level1;

import java.util.*;

public class 숫자_문자열과_영단어 {
    public int solution(String s) {

        // soulution 1. HashMap 이용
        // 해시맵에 0~9까지 저장한다.
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        // 문자열에 해시맵에 저장된 영단어가 포함되어 있을 경우 영단어의 값으로 바꾼다.
        for(String key : map.keySet()) {
            if(s.contains(key)) {
                s = s.replace(key, map.get(key));
            }
        }

        // 문자열을 숫자로 변환한다.
        return Integer.parseInt(s);


        // solution 2. 배열 이용
        // 문자열 배열에 0~9까지 저장한다.
//        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//
//        // 문자열에 배열에 저장된 영단어가 포함되어 있을 경우 영단어의 값으로 바꾼다.
//        for(int i = 0; i < words.length; i++) {
//            s = s.replaceAll(words[i], Integer.toString(i));
//        }
//
//        // 문자열을 숫자로 변환한다.
//        return Integer.parseInt(s);

    }
}
