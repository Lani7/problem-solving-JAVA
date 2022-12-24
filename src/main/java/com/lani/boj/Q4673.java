package com.lani.boj;

public class Q4673 {

    public static void d() {
        int n = 1;
        boolean[] nArr= new boolean[10001];
        for(int i = 1; i < 10000; i++) {
            if( i < 100) {
                n = i + (i / 10) + (i % 10);
            } else if ( i < 1000) {
                n = i + (i / 100) + ( (i % 100) / 10) + ( (i % 100) % 10);
            } else if (i < 10000) {
                n = i + (i / 1000) + ( (i % 1000) / 100) +  ( ((i % 1000) % 100) / 10) + ( ((i % 1000) % 100) % 10);
            }
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
