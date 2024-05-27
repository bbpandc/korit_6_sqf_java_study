package com.study.java_study.ch07_클래스02.접근지정자;

import com.study.java_study.ch07_클래스02.StudyB; // 다른 폴더(패키지)의 객체를 생성하고 싶으면 import 해줘야함.

/*
    <접근지정자>
    1. private -> 같은 객체(클래스) 안에서만 접근 할 수 있다.
    2. public -> 모든 영역에서 접근 할 수 있다.
    3. default -> 같은 패키지 안에서만 접근 할 수 있다.
    4. protected -> default와 동일하게 같은 패키지 안에서 접근 할 수 있고,
                    상속관계일 때에는 다른 패키지에 있어도 접근 할 수 있다.(상속관계o -> public, 상속관계x -> default)
 */

public class AccessMain {

    private String test;

    public void printTest() {
        System.out.println(test);
    }

    public static void main(String[] args) {
        StudyB b = new StudyB("김준일", 31);
        b.show(); // 김준일 31
        b.setName("김준이");
        System.out.println(b.getName()); // 김준이

        AccessMain accessMain = new AccessMain();
        accessMain.printTest();
        accessMain.test = "테스트"; // private test -> 같은 클래스에서는 접근 가능

    }
}
