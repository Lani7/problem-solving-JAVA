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

    public static int hansu2(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(i < 100)   cnt++;
            else {
                int hun = i / 100;
                int ten = (i % 100) / 10;
                int one = i % 10;
                if((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int hansu3(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(i < 100)   cnt++;
            else {
                String[] str = Integer.toString(i).split("");
                if(Integer.parseInt(str[0])-Integer.parseInt(str[1]) == Integer.parseInt(str[1])-Integer.parseInt(str[2]))
                    cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println( hansu(n) );
//        System.out.println( hansu2(n) );
//        System.out.println( hansu3(n) );

        bf.close();
    }
}
