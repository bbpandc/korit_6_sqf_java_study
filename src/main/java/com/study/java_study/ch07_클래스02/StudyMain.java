package com.study.java_study.ch07_클래스02;

public class StudyMain {

    public static void main(String[] args) {
        StudyA a = new StudyA(100, 1000);
        System.out.println(a.num); // 100
        System.out.println(a.num2); // 1000

        System.out.println(a); // com.study.java_study.ch07_클래스02.StudyA@49e4cb85

        StudyB b = new StudyB();
        b.show();

    }
}
