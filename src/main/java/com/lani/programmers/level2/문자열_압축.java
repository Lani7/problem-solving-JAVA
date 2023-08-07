package com.lani.programmers.level2;

public class 문자열_압축 {
    public int solution(String s) {
        int answer = 0;
        int[] arr = new int[s.length()];
        String range;   // 문자열 범위
        boolean flag = false;

        // 문자열을 쪼갠다.
        for(int i = 1; i <= s.length(); i++) {
            int cnt = 1;    // 연속하는 횟수
            // 1개 단위 ~ 문자열 전체 길이까지 단위를 정한다.
            range = s.substring(0, i);

            StringBuilder zip = new StringBuilder(); // 일치하는 문자를 압축해서 표현한 문자열

            if(range.length() == s.length()) {
                // 문자 범위와 문자열의 전체 길이가 같을 경우 문자열 길이 그대로 배열에 넣는다.
                arr[i - 1] = s.length();
                break;
            }

            // 앞에서부터 쪼갠 단위만큼 문자열이 일치하는지 확인한다.
            for(int idx = i; idx < s.length(); idx += range.length()) {

                if( range.length() > idx + range.length() || idx + range.length() >= s.length()) {
                    // 남은 문자보다 문자 범위의 길이가 더 클 경우 또는 범위만큼 잘라낼 문자 길이가 문자열 전체 길이보다 클 경우
                    // 남은 나머지 문자열 그대로 출력
                    String rest = s.substring(idx, s.length());

                    if(rest.equals(range))  {
                        cnt++;
                        flag = true;
                    }

                    if(flag == true) {
                        zip.append(cnt + range);    // 일치하는 문자와 횟수 추가
                    } else {
                        if(cnt > 1) zip.append(cnt + range);    // 일치하는 문자와 횟수 추가
                        else if(cnt == 1)   zip.append(range);
                        zip.append(rest);           // 나머지 문자열 추가
                    }

                    continue;
                }

                String trimmed = s.substring(idx, idx + range.length()); // 범위만큼 잘라낸 문자열

                // 문자 범위만큼 잘라낸 문자열이 이전의 문자열과 같은지 비교
                if(trimmed.equals(range)) {
                    cnt++;  // 일치할 경우 연속하는 횟수 증가
                    flag = true;
                } else {
                    // 일치하지 않는 경우
                    flag = false;
                }

                // 일치하지 않는 문자열이 나올 경우
                if(flag == false) {
                    // 이전부터 증가했던 연속 일치 횟수가 1보다 클 경우 연속했던 이전 횟수와 문자열 추가
                    if(cnt > 1)    zip.append(cnt + range);
                        // 일치하지 않는 문자열 하나를 추가
                    else if(cnt == 1)   zip.append(range);
                    cnt = 1;    // 초기화
                }

                range = trimmed;
                flag = false;

            }

            // 압축한 문자열의 개수 배열에 넣는다.
            arr[i - 1] = zip.length();
        }

        int min = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == 0)  min = arr[0];
            if(arr[i] < min)    min = arr[i];
        }

        answer = min;

        return answer;
    }
}
