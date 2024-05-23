package com.study.java_study.ch04_제어;

public class 조건문02 {

    public static void main(String[] args) {
        String text = new String("");
        String name = "김해민"; // 값의 자료형이 String
        String phone = null; // 값의 자료형이 null

        System.out.println(text.length()); // 0
        System.out.println(name.length()); // 0
        // System.out.println(phone.length()); // 런타임 오류 // 자료형이 null이기 때문에 .length를 못쓴다.

        StringUtils stringUtils = new StringUtils();

        // '=='는 주소값 비교, '.equals'는 안의 내용 비교

        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return; // return을 만나서 main 함수를 빠져나온다. 이 조건문이 참이면 밑의 코드는 작동하지 않는다.
        }

        // 자료형이 null이기 때문에 .equals를 못쓴다.
        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }

        // text와 ""의 주소가 다르기 때문에 조건이 성립하지 않는다(출력 x).
        // if(text == null || text == "") {
        //     System.out.println("text가 비어있습니다.");
        // }

        if(stringUtils.isEmpty(text)) {
            System.out.println("text가 비어있습니다.");
            return; // 이 밑에 코드가 더 이상 없다면 이 return은 의미가 없다.
        }

    }
}
