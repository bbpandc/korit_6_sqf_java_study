package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {

    public static void main(String[] args) {
        /*
            <매개변수가 없거나 하나인 기본 함수형 인터페이스>
            1. Runnable
            run(): 매개변수 x, 리턴값 x
            2. Consumer
            accept(): 매개변수 o, 리턴값 x
            3. Supplier
            get(): 매개변수 x, 리턴값 o
            4. Function
            apply(): 매개변수 o, 리턴값 o
            5. Predicate
            test(): 매개변수 o, 리턴값 o(boolean 으로 고정)
         */

        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };

        runnable.run();

        Function<String, Integer> fx = s -> Integer.parseInt(s); // Integer.parseInt(): 괄호안의 값을 Integer 타입으로 바꿔줌.

        Integer num = fx.apply("10");
        System.out.println("num: " + num); // num: 10
        Integer num2 = fx.andThen(result -> result + 100).apply("10"); // .apply()가 먼저 실행됨. 그 리턴값이 result로 들어감.
        System.out.println("num2: " + num2); // num2: 110

        Consumer<String> transform = s -> {
            System.out.println(s + "서버에 접속하였음.");
            System.out.println(s + "님 환영합니다.");
        };

        transform.accept("김준일");

        Supplier<Integer> role = () -> {
            Integer result = num + 999;
            return result;
        };

        System.out.println(role.get()); // 1009

        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(10)); // true

    }
}
