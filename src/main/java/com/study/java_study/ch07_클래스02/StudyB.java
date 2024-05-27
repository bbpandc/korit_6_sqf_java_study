package com.study.java_study.ch07_클래스02;

public class StudyB {

    private String name;
    private int age;

    public StudyB() {} // 생성자를 오버로딩 하기 전까지는 NoArgsConstructor이 기본으로 생략되어있음.

    public StudyB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter, setter, Constructor 단축키: Alt + Insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name);
        System.out.println(age);
    }

}
