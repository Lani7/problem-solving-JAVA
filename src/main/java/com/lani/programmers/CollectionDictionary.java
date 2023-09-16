package com.lani.programmers;

import java.util.*;

class CollectionDictionary {
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
