package com.study.java_study.ch04_제어;

public class 스위치 {

    public static void main(String[] args) {
        String grade = "A";

        // 거의 모든 switch case 에서는 break를 쓴다.
        switch (grade) {
            case "A":
                System.out.println("A등급");
                break;
            case "B":
                System.out.println("B등급");
                break;
            case "C":
                System.out.println("C등급");
                break;
            case "D":
                System.out.println("D등급");
                break;
            default:
                System.out.println("F등급");
                break;
        }

    }
}
