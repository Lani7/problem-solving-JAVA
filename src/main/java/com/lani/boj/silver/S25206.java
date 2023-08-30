package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        // (학점 * 과목평점)의 합
        double ogp = 0;
        // 학점 총합
        double sum = 0;
        // 평균 학점
        double avg = 0;

        for(int i = 0; i < 20; i++ ) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String subject = st.nextToken();
            // 과목 학점 
            double credit = Double.parseDouble(st.nextToken());
            // 과목평점
            String grade = st.nextToken();
            double score = 0.0;
            switch (grade) {
                case "A+" : score = 4.5; break;
                case "A0" : score = 4.0; break;
                case "B+" : score = 3.5; break;
                case "B0" : score = 3.0; break;
                case "C+" : score = 2.5; break;
                case "C0" : score = 2.0; break;
                case "D+" : score = 1.5; break;
                case "D0" : score = 1.0; break;
                default   : score = 0.0; break;
            }
            // (학점 * 과목평점)
            if(!grade.equals("P")) {
                ogp += credit * score;
                sum += credit;
            }

        }
        // 학점의 총합
        avg = ogp / sum;
        System.out.printf("%.6f", avg);

        bf.close();
    }
}
