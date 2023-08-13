package com.lani.programmers.level1;

public class 신규_아이디_추천 {
    public String solution(String new_id) {

        // 1. 모든 알파벳이 소문자여야 한다.
        new_id = new_id.toLowerCase();

        // 2. 알파벳 소문자, 숫자, -, _, . 를 제외한 모든 문자를 제거한다.
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]*", "");

        // 3. .가 2번 이상 연속 -> . 하나로 치환
        new_id = new_id.replaceAll("[.]{2,}", ".");

        // 4. .가 처음이나 끝에 있다면 제거한다.
        new_id = new_id.replaceAll("^[.]+|[.]+$", "");
        // new_id = new_id.replaceAll("^\\.+|\\.+$", "");

        // 5. 빈 문자열이면 "a"를 대입한다.
        if(new_id.isEmpty())   new_id += "a";
        // if(new_id.equals(""))   new_id += "a";

        // 6. 길이가 16이상이면 첫 15개 문제를 제외한 나머지 문자들 제거
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }

        // 6-2. .가 끝에 있다면 제거한다.
        new_id = new_id.replaceAll("[.]+$", "");
        // new_id = new_id.replaceAll("\\.+$", "");

        // 7. 길이가 2자 이하면 마지막 문자를 길이가 3이 될 때까지 반복해서 붙인다.
        while(new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
//        if(new_id.length() <= 2) {
//            for(int i = new_id.length(); i < 3; i++) {
//                new_id += Character.toString(new_id.charAt(new_id.length() - 1));
//            }
//        }

        return new_id;
    }
}
