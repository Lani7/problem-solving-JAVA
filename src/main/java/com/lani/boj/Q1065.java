package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {

    public static int hansu(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(i/10 == 0)   cnt++;
            else {
                int first = 0;
                int tempNum = i;
                int rate = 0;
                int befRate= 0;
                boolean flag = true;
                int tempCnt = 0;
                int flagCnt = 0;
                while(tempNum/10 != 0) {
                    first = tempNum % 10;  // 첫째자리수
                    tempNum = tempNum / 10; // 나머지 자리
                    befRate = rate;
                    rate = first - (tempNum % 10);
                    if(tempCnt != 0) {
                        if(befRate != rate) { flag = false; }
                    }
                    tempCnt++;
                    if(flag == true)  flagCnt++;

                }
                if(flagCnt == Integer.toString(i).length()-1) cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println( hansu(n) );

        bf.close();
    }
}
