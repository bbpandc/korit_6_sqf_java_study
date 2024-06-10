package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("run");

        runnable.run();

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {
                System.out.println("num: " + num);
            }
        };

        consumer.accept(10);

        Function<Integer, String> function = num -> "num: " + (num + 10);

        System.out.println(function.apply(100));

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num % 2 != 0;
            }
        };

        System.out.println(predicate.test(10));

        Supplier<Boolean> supplier = () -> !predicate.test(10);

        System.out.println(supplier.get());

    }
}
