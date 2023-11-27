package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S10825 {
    static class Student {
        private String name;
        private int language;
        private int english;
        private int math;

        Student(String name, int language, int english, int math) {
            this.name = name;
            this.language = language;
            this.english = english;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Student[] arr = new Student[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int language = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            arr[i] = new Student(name, language, english, math);
        }

        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.language == o2.language) {
                    if (o1.english == o2.english) {
                        if (o1.math == o2.math)
                            return o1.name.compareTo(o2.name);
                        return o2.math - o1.math;
                    }
                    return o1.english - o2.english;
                }
                return o2.language - o1.language;
            }
        });

        for (Student student : arr)
            sb.append(student.name).append('\n');

        System.out.println(sb);

        br.close();
    }
}
