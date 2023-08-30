package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m < 45 ) {
            m += 15;   // 분에 60을 더한 다음 45를 빼기
           if( h == 0 ) {
               h = 23;
               System.out.println(h + " " + m );
           } else {
                h--;
                System.out.println(h + " " + m );
           }

        } else {
            m -= 45;
            System.out.println(h + " " + m);
        }

        bf.close();
    }
}
