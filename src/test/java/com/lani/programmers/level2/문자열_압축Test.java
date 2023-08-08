package com.lani.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 문자열_압축Test {

    @Test
    public void test() {
//        assertThat(solution("aabbaccc")).isEqualTo(7);
//        assertThat(solution("ababcdcdababcdcd")).isEqualTo(9);
//        assertThat(solution("abcabcdede")).isEqualTo(8);
        assertThat(solution("abcabcabcabcdededededede")).isEqualTo(14);
//        assertThat(solution("xababcdcdababcdcd")).isEqualTo(17);

//        assertThat(solution("aaaaa")).isEqualTo(2);
//        assertThat(solution("acacacbacacac")).isEqualTo(9);
//        assertThat(solution("acacacacacacbacacacacacac")).isEqualTo(9);
//        assertThat(solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")).isEqualTo(4);
    }

    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        String range;   // 문자열 범위
        boolean flag = false;

        // 문자열을 쪼갠다.
        for(int i = 1; i <= s.length() / 2 + 1; i++) {
            int cnt = 1;    // 연속하는 횟수
            // 1개 단위 ~ 문자열 전체 길이까지 단위를 정한다.
            range = s.substring(0, i);

            StringBuilder zip = new StringBuilder(); // 일치하는 문자를 압축해서 표현한 문자열

            // 앞에서부터 쪼갠 단위만큼 문자열이 일치하는지 확인한다.
            for(int idx = i; idx < s.length(); idx += range.length()) {
                int end = idx + range.length();
                if(end > s.length())    end = s.length();

                String trimmed = s.substring(idx, end); // 범위만큼 잘라낸 문자열

                // 문자 범위만큼 잘라낸 문자열이 이전의 문자열과 같은지 비교
                if(trimmed.equals(range)) {
                    cnt++;  // 일치할 경우 연속하는 횟수 증가

                } else {
                    // 일치하지 않는 경우
                    // 이전부터 증가했던 연속 일치 횟수가 1보다 클 경우 연속했던 이전 횟수 추가
                    if(cnt > 1)    zip.append(cnt);
                    zip.append(range);
                    cnt = 1;    // 초기화
                }

                range = trimmed;
            }

            // 마지막 남은 문자열
            if(cnt > 1)    zip.append(cnt);
            zip.append(range);

            // 더 작은 수를 answer에 저장한다.
            answer = Math.min(answer, zip.length());

        }

        return answer;
    }
}