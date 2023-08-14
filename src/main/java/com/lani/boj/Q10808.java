package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        // 알파벳 수만큼의 크기를 가진 배열을 생성한다
        int[] arr = new int[26];
        char c;
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            // 문자열 단어를 문자로 쪼갠다.
            c = str.charAt(i);
            // 각 문자 아스키코드를 알파벳 순서대로 인덱스에 넣어 +1을 저장한다.
            cnt = c - 'a';
            arr[cnt]++;
        }

        // 배열을 출력한다.
        for(int a : arr) {
            System.out.print(a + " ");
        }

        bf.close();
    }
}
