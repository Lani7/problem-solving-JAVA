package com.lani.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CollectionDictionaryTest {
    @Test
    public void test() {
        assertThat(solution("AAAAE")).isEqualTo(6);
//        assertThat(solution("AAAE")).isEqualTo(10);
//        assertThat(solution("I")).isEqualTo(1563);
//        assertThat(solution("EIO")).isEqualTo(1189);

//        assertThat(solution("AAE")).isEqualTo(4);
    }

    static int answer;
    static int idx;
    static char[] arr = {'A', 'E', 'I', 'O', 'U'};

    // 단어를 만든다.
    private void makeWord(String word, String str, int n) {
//        System.out.println(str);

        if(str.equals(word)) {
            answer = idx;
            return;
        }
        if(n == 5)  return;

        for(int i = 0; i < 5; i++) {
//            StringBuilder sb = new StringBuilder(str);

            idx++;
            makeWord(word, str+arr[i], n+1);

//            makeWord(word, sb.append(arr[i]).toString(), n+1);
        }

    }

    public int solution(String word) {

        makeWord(word, "", 0);

         return answer;
    }
}