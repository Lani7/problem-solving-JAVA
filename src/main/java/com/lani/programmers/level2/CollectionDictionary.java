package com.lani.programmers.level2;

import java.util.*;

class CollectionDictionary {
    static int answer;
    static int idx;
    static char[] arr = {'A', 'E', 'I', 'O', 'U'};

    // 단어를 만든다.
    private void makeWord(String word, String str, int n) {

        if(str.equals(word)) {
            answer = idx;
            return;
        }
        if(n == 5)  return;

        for(int i = 0; i < 5; i++) {
            idx++;
            makeWord(word, str+arr[i], n+1);
        }

    }

    public int solution(String word) {

        makeWord(word, "", 0);

        return answer;
    }
}
