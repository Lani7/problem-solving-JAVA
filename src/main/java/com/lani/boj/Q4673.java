package com.lani.boj;

public class Q4673 {

    public static void d() {
        int n;
        boolean[] nArr= new boolean[10001];
        for(int i = 1; i < 10000; i++) {
            int tempNum = i;
            n = i;
            while(tempNum != 0) {
                n += (tempNum) % 10;    // 첫째자리수를 더하기
                tempNum = tempNum / 10; // 나머지 자리수를 tempNum에 저장
            }

//            if( i < 100) {
//                n = i + (i / 10) + (i % 10);
//            } else if ( i < 1000) {
//                n = i + (i / 100) + ( (i % 100) / 10) + ( (i % 100) % 10);
//            } else if (i < 10000) {
//                n = i + (i / 1000) + ( (i % 1000) / 100) +  ( ((i % 1000) % 100) / 10) + ( ((i % 1000) % 100) % 10);
//            }

            if(n <= 10000)    nArr[n] = true;
        }


        for(int i = 1; i < nArr.length; i++) {
            if(nArr[i] != true) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        Q4673.d();

    }
}
