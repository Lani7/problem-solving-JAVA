package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4779 {

    private static StringBuffer sb;

    private static int getSpace(int n) {
        // 각 구간을 3등분해서 가운데 구간을 제외한다.

        if(n == 0) {
            sb.append("-");
            return 1;
        }

        int space = getSpace(n - 1) * 3;

        // 공백
        int section = space / 3;
        for (int i = section; i < section * 2; i++) {
            sb.append(" ");
        }

        // 나머지 구간
        getSpace(n - 1);

        return space;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while((s = bf.readLine()) != null && !s.isEmpty()) {
            int n = Integer.parseInt(s);
            sb = new StringBuffer();

            getSpace(n);

            System.out.println(sb.toString());

        }
        bf.close();
    }
}
