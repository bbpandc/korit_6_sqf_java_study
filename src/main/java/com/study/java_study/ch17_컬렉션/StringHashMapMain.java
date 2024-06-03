package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {

    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();

        strMap.put(10, "김준일");
        strMap.put(11, "김준이");
        strMap.put(12, "김준삼");
        strMap.put(13, "김준사");

        System.out.println(strMap); // {0=김준일, 1=김준이, 2=김준삼, 3=김준사}

        System.out.println(strMap.get(0)); // null
        System.out.println(strMap.get(11)); // 김준이

        // 맵 바로 (put과 동시에)생성. 이후에 값들을 추가, 삭제, 수정 못함. new로 생성 해야 가능.
        Map<String, String> lang =  Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        System.out.println(lang); // {js=자바스크립트, python=파이썬, c=C, java=자바}

        System.out.println(lang.get("java")); // 자바

        // Map의 key 와 value 한 세트씩 Entry 타입으로 Set 안에 하나씩 들어있음(List는 중복을 허용해서 사용X)
        Set<Map.Entry<String, String>> entries = lang.entrySet();

        for(Map.Entry<String, String> entry : entries) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }

    }
}
