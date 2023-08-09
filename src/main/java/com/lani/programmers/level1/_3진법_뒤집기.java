package com.lani.programmers.level1;

public class _3진법_뒤집기 {

    // x진법을 10진법으로 변환한다.
    private int toDecimal(String s, int radix) {
        char[] arr = s.toCharArray();
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += (arr[i]-'0') * Math.pow(radix, cnt);
            cnt++;
        }
        return sum;
    }

    public int solution(int n) {
        int answer = 0;

        // 자연수 n을 3진법으로 바꾼다.
        // StringBuilder sb = new StringBuilder();
        // while(n > 0) {
        //     sb.append(n % 3);
        //     n /= 3;
        // }
        // String three = sb.reverse().toString();

        String three = Integer.toString(n, 3);

        // 거꾸로 바꾼다.
        String reversed = new StringBuilder(three).reverse().toString();

        // 10진법으로 표현한다.
        // String ten = Integer.toString( toDecimal(three, 3));
        // answer = Integer.parseInt(ten);

        answer = Integer.parseInt(reversed, 3);

        return answer;
    }
}
