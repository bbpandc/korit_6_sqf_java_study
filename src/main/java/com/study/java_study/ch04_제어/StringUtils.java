package com.study.java_study.ch04_제어;

public class StringUtils {

    boolean isEmpty(String str) {
        // 항상 null을 먼저 비교. 자료형이 null인 str이 올 수도 있어서('조건문02'의 phone).
        // 자료형이 null인 str의 .equals를 먼저 비교하면 .equals가 없기 때문에 오류가 난다.
        if(str == null) {
            return true; // return을 만나면 함수를 빠져나온다. 즉, 이 조건문이 참이면 밑의 코드는 작동하지 않는다.
        }
        return str.equals("");
    }

}
