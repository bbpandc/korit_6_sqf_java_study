package com.study.java_study.ch14_Object;

import java.util.Objects;

public class Student {

    // 변수, 생성자, getter and setter, equals, hashCode, toString 순서대로 작성

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter and setter

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj;
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return false;
    }

    @Override
    public int hashCode() { // 주소를 알려줌
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
