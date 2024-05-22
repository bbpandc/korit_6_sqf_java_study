package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {

        Function03 fx = new Function03();

        fx.fx01(1234, "김해민", 22, "01066543523");

        Student student = new Student();
        student.studentCode = 1234;
        student.name = "김해민";
        student.age = 22;
        student.phone = "01066543523";

        fx.fx02(student);

    }
}
