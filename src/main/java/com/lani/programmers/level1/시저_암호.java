package com.lani.programmers.level1;

public class 시저_암호 {
    public String solution(String s, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();

        char[] arr = s.toCharArray();
        char c;
        for(int i = 0; i < arr.length; i++) {
            // 공백일 경우
            if(arr[i] == ('a' - 'A')) { //a(97) - A(65) = space(32)
                answer = sb.append(arr[i]).toString();
                continue;
            }

            if(arr[i] >= 'a') {
                c = (char) ('a' + (arr[i] + n - 'a') % 26);
            } else {
                c = (char) ('A' + (arr[i] + n - 'A') % 26);
            }

//             int temp =  arr[i] + n;
//             if( ( (arr[i] >= 'A' && arr[i] <= 'Z') && temp > 'Z') || temp > 'z') {
//                 c = (char)( temp - 26);
//             } else {
//                 c = (char) temp;
//             }

            answer = sb.append(c).toString();
        }

        return answer;
    }
}
