package com.study.java_study.ch16_제네릭;

public class MessageMain {

    public static void main(String[] args) {
        // 제네릭 와일드 카드: 기호 -> ?

        Message<?> m1; // ?: Object
        Message<String> m2 = null;

        m1 = new Message<>("10");
        String s = (String) m1.getMessage(); // Object -> String 으로 다운캐스팅

        // 와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10"); // 하행
                                                            // String 이거나 String을 상속받은 클래스만 들어올 수 있다.
        Message<? super String> m4 = new Message<>(new Object());   // 상행
                                                                    // String 이거나 String 상위의 클래스만 들어올 수 있다.
        String s2 = m3.getMessage();

    }
}
