package com.lani.doit_basic.ch02;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for (int n = 5; n <= 1000; n += 2) {
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;       // 곱셈과 나눗셈의 연산 수행 횟수 계산
                if(n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                prime[ptr++] = n;
                counter++;
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);
    }
}
