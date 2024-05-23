package com.study.java_study.ch03_함수;

public class Function04 {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    // 오버로딩: 메소드명과 리턴 타입(자료형)은 같고 매개변수의 개수나 형태(자료형)가 다른 것
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // 오버로딩
    void add(int a, String b) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }

}
