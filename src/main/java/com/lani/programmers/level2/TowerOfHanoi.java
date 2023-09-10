package com.lani.programmers.level2;

import java.util.*;

public class TowerOfHanoi {
    static List<int[]> list;

    private void hanoi(int n, int x, int y) {
        // 첫 기둥에서 중간 기둥으로
        if(n > 1)   hanoi(n - 1, x, 6 - x - y);

        // 첫 기둥에서 마지막(목표) 기둥으로
        list.add(new int[] {x, y});

        // 중간 기둥에서 마지막(목표) 기둥으로
        if(n > 1)   hanoi(n - 1, 6 - x - y, y);

    }

    public int[][] solution(int n) {

        list = new ArrayList<>();

        hanoi(n, 1, 3);

        // 하노의의 탑 수행 횟수 : 2^n - 1

        return list.toArray(new int[0][]);
    }
}
