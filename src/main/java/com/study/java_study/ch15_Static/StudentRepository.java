package com.study.java_study.ch15_Static;

public class StudentRepository {

    private String[] names;

    private static StudentRepository instance; // 싱글톤 필수 요소 // 자기 자신의 객체를 담는 static instance 변수

    private StudentRepository() { // 싱글톤 필수 요소 // private 생성자
        names = new String[5];
    }

    public static StudentRepository getInstance() { // 싱글톤 필수 요소 // 자기 자신의 객체를 생성할 수 있는
        if(instance == null) {                      // static instance getter
            instance = new StudentRepository();
        }
        return instance;
    }

    public void add(String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }

}
