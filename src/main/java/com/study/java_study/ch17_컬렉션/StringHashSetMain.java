package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringHashSetMain {

    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();

        // Set은 중복을 허용하지 않기 때문에 list의 값들을 중복없이 정리하려면 list를 set으로 바꾼 후 다시 list로 바꾸면 중복이 없어진다.

        // 추가
        strSet.add("김준일");
        strSet.add("김준이");
        strSet.add("김준삼");
        strSet.add("김준사");
        strSet.add("김준사");
        strSet.add("김준사");

        System.out.println(strSet); // [김준이, 김준일, 김준삼, 김준사]

        for(String name : strSet) {
            System.out.println(Objects.hash(name));
        }

        strSet.addAll(List.of("김준일", "김준일", "김준이"));

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
            }
        };
//                               = ^
        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2));
        System.out.println(strList); // [김준이, 김준일, 김준삼, 김준사]

    }
}
