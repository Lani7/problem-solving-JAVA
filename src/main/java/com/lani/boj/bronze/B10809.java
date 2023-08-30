package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        byte[] s = bf.readLine().getBytes();
        int[] alphabet = new int[26];
        // alphabet 배열 초기화
        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for(int i = 0; i < s.length; i++){
            // 요소가 -1인 경우에만 저장
            if(alphabet[s[i]-97] == -1)     alphabet[s[i]-97] = i;

        }
        for(int a : alphabet) System.out.print(a + " ");

        bf.close();
    }


}
