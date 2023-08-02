package com.lani.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.lang.*;


class 거리두기_확인하기Test {
    @Test
    public void test() {
        assertThat(solution(new String[][]{ {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}})).containsExactly(1, 0, 1, 1, 1);
    }
    private static class P {
        public final int x;
        public final int y;

        private P(int y, int x) {
            this.x = x;
            this.y = y;
        }
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        boolean flag = true;

        for(int i = 0; i < places.length; i++) {

            List<P> list = new ArrayList<>();

            for(int j = 0; j < places.length; j++){
                for(int k = 0; k < places.length; k++) {
                    if( places[i][j].charAt(k) == 'P' ) {
                        // p에 해당하는 좌표를 list에 담는다
                        P p = new P(j, k);
                        list.add(p);
                    }
                }
            }

            // list에 담긴 p의 좌표들을 검사한다.
            for(int a = 0; a < list.size() - 1; a++) {
                flag = true;
                for(int b = a + 1; b < list.size(); b++) {
                    // 1. 맨해튼 거리가 2 이하여야 한다.
                    int subX = Math.abs(list.get(a).x - list.get(b).x);
                    int subY = Math.abs(list.get(a).y - list.get(b).y);
                    if(subX + subY <= 2) {
                        // 2. O가 있는지 체크.
                        int left = list.get(a).x - 1;
                        int right = list.get(a).x + 1;
                        int up = list.get(a).y - 1;
                        int down = list.get(a).y + 1;


                        if((subX == 0 && subY == 1) || (subX == 1 && subY == 0)) {
                            flag = false; break;
                        }

                        if(subX == 0) {
                            if(list.get(a).y < list.get(b).y
                                    && (places[i][down].charAt(list.get(a).x) == 'O')) {
                                flag = false; break;
                            }
                            else if(list.get(a).y > list.get(b).y
                                    && (places[i][up].charAt(list.get(a).x) == 'O')) {
                                flag = false; break;
                            }
                        } else if(subY == 0) {
                            if(list.get(a).x < list.get(b).x
                                    && (places[i][list.get(a).y].charAt(right) == 'O')) {
                                flag = false; break;
                            }
                            else if(list.get(a).x > list.get(b).x
                                    && (places[i][list.get(a).y].charAt(left) == 'O')){
                                flag = false; break;
                            }
                        }
                        // 대각선에 p가 있는 경우
                        else {
                            if( list.get(a).x > list.get(b).x ) {
                                if(list.get(a).y > list.get(b).y ) {
                                    if(places[i][list.get(a).y].charAt(left) == 'O'
                                            || places[i][up].charAt(list.get(a).x) == 'O'){
                                        flag = false; break;
                                    }
                                } else {
                                    if(places[i][list.get(a).y].charAt(left) == 'O'
                                            || places[i][down].charAt(list.get(a).x) == 'O'){
                                        flag = false; break;
                                    }
                                }
                            } else {
                                if(list.get(a).y < list.get(b).y ) {
                                    if(places[i][list.get(a).y].charAt(right) == 'O'
                                            || places[i][down].charAt(list.get(a).x) == 'O'){
                                        flag = false; break;
                                    }
                                } else {
                                    if(places[i][list.get(a).y].charAt(right) == 'O'
                                            || places[i][up].charAt(list.get(a).x) == 'O'){
                                        flag = false; break;
                                    }
                                }

                            }

                        }

                    }
                }
                if(flag == false)   break;
            }
            if (flag == false)   answer[i] = 0;
            else                 answer[i] = 1;
            flag = true;
        }

        return answer;
    }
}