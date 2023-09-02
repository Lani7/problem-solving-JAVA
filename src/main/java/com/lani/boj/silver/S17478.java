package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 재귀함수가 뭔가요?
public class S17478 {
//    static StringBuilder sb;
    static int totalN;

//    private static String underline(int n) {
//        if(n != totalN)
//            sb.append("____");
//
//        return sb.toString();
//    }

    private static void underline(int l) {
        if(l < 1)  return;

        System.out.print("____");

        underline(l - 1);
    }

    private static void whatsRecur(int n) {
        int l = totalN - n;

//        String underline = underline(n);

//        System.out.print(underline);
        underline(l);
        System.out.println("\"재귀함수가 뭔가요?\"");

        if(n < 1)  {
//            System.out.print(underline);
            underline(l);
            System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");

//            System.out.print(underline);
            underline(l);
            System.out.println("라고 답변하였지.");
            return;
        }

//        System.out.print(underline);
        underline(l);
        System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");

//        System.out.print(underline);
        underline(l);
        System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");

//        System.out.print(underline);
        underline(l);
        System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        whatsRecur(n - 1);

//        System.out.print(underline);
        underline(l);
        System.out.println("라고 답변하였지.");

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        totalN = n;
//        sb = new StringBuilder();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        whatsRecur(n);

        bf.close();
    }
}
