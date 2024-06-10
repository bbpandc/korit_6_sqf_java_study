package com.study.java_study.ch22_예외;

import java.util.ArrayList;
import java.util.List;

public class NullExceptionMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("신선애");
        names.add("김동인");
        names.add("백승주");
        names.add("김준일");

        try {
//            names.forEach(name -> System.out.println(name.toString()));
            for(int i = 0; i < 5; i++) {
                System.out.println(names.get(i).toString()); // 반복 도중 오류가 나면 try 문을 빠져나옴
            }
            System.out.println("트라이 마지막 부분"); // 반복 도중 오류가 나면 이 부분은 실행이 안됨

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) { // 최상위
            e.printStackTrace();
        } finally {
            System.out.println("예외이든 아니든 실행");
        }

        System.out.println("프로그램 종료");

    }
}
