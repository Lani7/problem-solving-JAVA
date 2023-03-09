package com.lani.doit_basic.ch02;

import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        // 배열 초기화는 마지막 요소에 대한 초기화 뒤에 추가로 쉼표(,)를 넣을 수 있음.
        int[] a = {1, 2, 3, 4, 5,};
        int[] b = a.clone();

        b[3] = 0;

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
