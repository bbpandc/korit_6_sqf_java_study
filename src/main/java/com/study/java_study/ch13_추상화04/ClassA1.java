package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA{

    // 추상메소드 오버라이딩: Ctrl + i
    @Override
    public void print(InterfaceA interfaceA) { // print 메소드가 interfaceA를 의존한다. interfaceA가 없으면 메소드 실행 불가
        System.out.println("A1 클래스에서 print호출");
        interfaceA.test();
    }

}
