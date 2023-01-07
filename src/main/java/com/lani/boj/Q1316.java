package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String word = bf.readLine();
            byte[] bytes = word.getBytes();
            int[] arr = new int[26];
            int prev = 0;
            boolean groupWord = true;
            for (int j = 0; j < bytes.length; j++) {
                // 단어의 각 알파벳을 하나씩 가져온다
                byte alphabet = bytes[j];
                // 이전 알파벳과 현재 알파벳이 다르면 이전 알파벳을 배열에 저장한다
                if( prev != alphabet)   arr[alphabet - 97]++;

                // 현재 알파벳을 이전 알파벳에 저장
                prev = alphabet;
            }

            for (int a: arr) {
                if(a > 1)     groupWord = false;
            }

            // 배열에서 1이 하나만 있는 겨우 그룹함수 true로 변경
            if(bytes.length == 1)   groupWord = true;

            if(groupWord == true)   cnt++;


            // 저장한 배열 중에서 2 이상인 것이 있으면 cnt를 하지 않고,

            // 1만 있다면 cnt를 한다 (그룹함수)
        }
        System.out.println(cnt);

        bf.close();

    }
}
