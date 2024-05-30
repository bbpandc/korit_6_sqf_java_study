package com.study.java_study.ch14_Object;

/*
    Object 클래스(최상위 클래스)

 */

import java.util.Objects;

public class ObjectMain {

    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("김준일", 31);
        Student student2 = new Student("김준일", 31);

        Object[] objects = new Object[3];
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("김준일", 31);

        System.out.println(student); // Student{name='김준일', age=31} // toString() 생략
                                     // Student 클래스에서 toString()을 오버라이드 안하면 주소가 나옴
        String str = new String("데이터");
        System.out.println(str.toString());

        String studentData = student.toString();

        System.out.println(student.equals(student2)); // true // 주소비교가 아니라 값 비교로 변함

        // Student 클래스에서 hashCode() 오버라이딩 하기 전
        System.out.println(student.hashCode()); // 940060004
        System.out.println(student2.hashCode()); // 234698513
        System.out.println(student.hashCode() == student2.hashCode()); // false

        System.out.println(Objects.hash("김준일")); // 44514523
        System.out.println(Objects.hash("김준일")); // 44514523

        // Student 클래스에서 hashCode() 오버라이딩 한 후
        System.out.println(student.hashCode()); // 1379950244
        System.out.println(student2.hashCode()); // 1379950244
        System.out.println(student.hashCode() == student2.hashCode()); // true

    }
}
