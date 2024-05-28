package com.study.java_study.ch09_클래스04;

public class IsEmptyIsBlank {

    public static void main(String[] args) {
        // .isEmpty()와 .isBlank()의 차이
        // .isEmpty(): .앞에 "" (문자열의 길이가 0)만 true. 문자열이나 공백이 들어오면 false.
        // .isBlank(): .앞에 "" (문자열의 길이가 0)와 공백일 떄 true. 문자열이 들어오면 false.

        System.out.println("hello".isEmpty()); // false
        System.out.println("hello".isBlank()); // false

        System.out.println("---------------------");

        System.out.println(" hello ".isEmpty()); // false
        System.out.println(" hello ".isBlank()); // false

        System.out.println("---------------------");

        System.out.println(" ".isEmpty()); // false
        System.out.println(" ".isBlank()); // true

        System.out.println("---------------------");

        System.out.println("".isEmpty()); // true
        System.out.println("".isBlank()); // true

    }
}
