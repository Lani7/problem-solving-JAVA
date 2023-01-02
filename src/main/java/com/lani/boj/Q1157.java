package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 방법 1
        String str = bf.readLine();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) <= 90 ) {
                arr[str.charAt(i)-'A']++;
            } else {
                arr[str.charAt(i)-'a']++;
            }
        }

        int cnt = 0;
        int max = 0;
        char maxChar = ' ';
        for (int i = 0; i < arr.length; i++) {
            cnt = arr[i];
            if(cnt > max) {
                max = cnt;
                maxChar = (char) (i +'A');
            } else if (cnt == max) {
                maxChar = '?';
            }
        }
        System.out.println(maxChar);

        // 방법 2
//        // 대문자로 변경
//        String[] chars = bf.readLine().toUpperCase().split("");
//
//        int cnt = 1;
//        int max = 0;
//        String maxChar = "";
//        String tempChar = "";
//
//        Loop1:
//        for (int i = 0; i < chars.length; i++) {
//            if(i == 0)  tempChar = chars[i];
//            // 이전에 반복했던 알파벳의 경우 건너뛴다
//            Loop2:
//            for (int j = 0; j < i; j++) {
//                if(chars[i].equals(chars[j])) {
//                    continue Loop1;
//                }
//            }
//            // 가장 많이 사용된 알파벳을 찾는다
//            for (int j = i+1; j < chars.length; j++) {
//
//                if(chars[i].equals(chars[j])) {
//                    cnt++;
//                }
//
//                tempChar = chars[i];
//            }
//            // 가장 많이 사용된 알파벳이 여러개 존재할 경우에는 ?를 출력하고
//            if(cnt == max) {
//                maxChar = "?";
//            }
//            // 그렇지 않으면 가장 많이 사용된 알파벳을 대문자로 출력한다
//            else if(cnt > max)   {
//                max = cnt;
//                maxChar = tempChar;
//            }
//
//            cnt = 1;
//        }
//
//        System.out.println(maxChar);
//
//        bf.close();


    }
}
