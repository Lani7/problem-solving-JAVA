package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int order = Integer.parseInt(bf.readLine());

        int parent = 1;     // 분모
        int son = 1;        // 분자

        int cnt = 1;
        int n = 2;        // 분모분자의 합 (대각선 숫자)
        boolean flag = true;

        while (flag) {

            for (int i = 0; i < n-1; i++) {

                if(n % 2 != 0) {
                    if(i == 0)  {
                        son = 1;
                        parent = n-1;
                    } else {
                        son++;
                        parent--;
                    }
                } else {
                    if(i == 0)  {
                        son = n-1;
                        parent = 1;
                    } else {
                        son--;
                        parent++;
                    }
                }
                if(cnt == order)    {
                    flag = false;
                    System.out.println(son + "/" + parent);
                    break;
                } else      cnt++;

            }
            n++;

        }

        bf.close();
    }
}
