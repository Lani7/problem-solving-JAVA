package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int originNum = Integer.parseInt(bf.readLine());
        int n = originNum;
        int cycle = 0;
        while(true) {
            cycle++;
            int addedNum = (n / 10) + (n % 10);
            int newNum = (n % 10) * 10 + (addedNum % 10);

            if(newNum == originNum) { break; }
            n = newNum;
        }

        System.out.println(cycle);


//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringBuffer sb = new StringBuffer(bf.readLine());
//        if(sb.length() == 1) { sb.insert(0, "0"); }
//        String originNum = sb.toString();
//        String str = sb.toString();
//        int cycle = 0;
//        int a;
//        int b;
//        while(true) {
//            cycle++;
//            // 주어진 수 분리하기
//            a = Integer.parseInt(str.substring(0, 1));
//            b = Integer.parseInt(str.substring(1));
//
//            String addedNum = Integer.toString(a + b);  // 분리한 수를 더한 후 문자열로 변환
//            // 더한 수가 2자리 이상일 경우
//            if(addedNum.length() > 1) {
//                // 더한 수의 오른쪽 자리 가져오기
//                int n1 = Integer.parseInt(addedNum.substring(0, 1));
//                int n2 = Integer.parseInt(addedNum.substring(1));
//                addedNum = Integer.toString(n2);
//            }
//            str = Integer.toString(b) + addedNum;  // 분리한 오른쪽자리 수와 더한 수를 연결해서 새로운 수 만들기
//            if(originNum.equals(str))  { break; }
//        }
//        System.out.println(cycle);

    }

}
