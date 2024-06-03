package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringArrayListMain {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        ArrayList<String> strList = new ArrayList<>();
        strList.add("test1");

        // 배열 <-> 리스트 변환
        List<String> list = Arrays.asList(strArray); // Arrays.asList(): 괄호 안의 배열을 리스트로 바꿔줌
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list); // .addAll(): 괄호안의 값들을 .앞의 리스트에 다 추가
        String[] strArray2 = strList.toArray(new String[strList.size()]); // .toArray: 리스트를 배열로 바꿔줌

        // 리스트 값 조회
        System.out.println(strList);

        // contains 포함 여부
        System.out.println(strList.contains("test")); // false
        System.out.println(strList.contains("test1")); // true

        // 리스트 바로 (add와 동시에)생성. 이후에 값들을 추가, 삭제, 수정 못함. new로 생성 해야 가능.
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        System.out.println(nums); // [1, 2, 3, 4, 5]

        // 제거
        strList.add("김준일");
        strList.add("김준이");
        strList.add("김준삼");
        System.out.println(strList); // [test1, 김준일, 김준이, 김준삼]
        // .remove(): 값으로 지우면 지워졌는지 true or false 리턴, 인덱스로 지우면 지운 값을 리턴
        System.out.println(strList.remove("test1")); // true
        System.out.println(strList); // [김준일, 김준이, 김준삼]
        System.out.println(strList.remove(1)); // 김준이
        System.out.println(strList); // [김준일, 김준삼]

        System.out.println(nums); // [1, 2, 3, 4, 5]
        List<Integer> nums2 = List.of(1, 3, 5);
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums);
        // .removeAll(): 괄호 안의 리스트(set)의 값과 .앞의 리스트에 일치하는 값들만 .앞의 리스트에서 지움
        System.out.println(nums3.removeAll(nums2)); // true
        System.out.println(nums3); // [2, 4]

        // 수정
        nums3.set(0, 10); // 0번 인덱스의 값을 10으로 수정
        System.out.println(nums3); // [10, 4]

        nums3.addAll(List.of(1, 2, 3));
        System.out.println(nums3); // [10, 4, 1, 2, 3]

        // 반복
        for(int i = 0; i < nums3.size(); i++) {
            System.out.println(nums3.get(i));
        }

        for(Integer num : nums3) {
            System.out.println(num);
        }

        Iterator<Integer> ir = nums3.iterator();
        while (ir.hasNext()) { // hasNext(): 다음이 있니?
            System.out.println(ir.next()); // 있으면 출력
        }

    }
}
