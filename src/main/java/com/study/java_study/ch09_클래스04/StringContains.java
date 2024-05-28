package com.study.java_study.ch09_클래스04;

public class StringContains {

    public static void main(String[] args) {
        String str = "법의 해석, 학리적 해석, 논리적해석, 확장해석";

        // .contains: .앞에 ()안의 문자열이 포함되어있나 확인함.
        boolean isContains = str.contains("해석");
        boolean isContains2 = "법의 해석, 학리적 해석, 논리적해석, 확장해석".contains("해석");

        System.out.println(isContains); // true
        System.out.println(isContains2); // true

    }
}
