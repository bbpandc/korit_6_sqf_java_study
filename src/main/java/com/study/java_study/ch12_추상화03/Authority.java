package com.study.java_study.ch12_추상화03;

/*
    인터페이스
    1. 일반 클래스와 동일하게 정의할 수 없다.
    2. 일반 변수(멤버변수)를 정의 할 수 없다.
    3. 무조건 상수만 정의 할 수 있다.
    4. 일반 메소드(멤버메소드)를 정의하기 위해서는 default 키워드를 사용하여야 한다.
    5. 추상 메소드를 정의 할 때 abstract 키워드를 생략 할 수 있다.
    6. 인터페이스 안에 정의되어지는 모든 상수와 메소드들은 public 접근 지정자를 사용한다.

    (***큰 틀은 클래스로, 기능적인 부분은 인터페이스로 만든다.
    ex. 컴퓨터 추상클래스를 만들어서 게임컴퓨터 클래스에서 상속받는다. 전기공급 인터페이스를 만들어서 게임컴퓨터 클래스에서 구현한다.
    컴퓨터는 게임컴퓨터일 수 있고, 게임컴퓨터는 컴퓨터다(추상 클래스로 만든다)
    게임컴퓨터는 전기를 공급 받지만 전기공급은 컴퓨에만 할 수 있는 것은 아니다(인터페이스로 만든다))

    (***상속받을 땐 하나의 클래스만 상속받을 수 있고, 구현 할 때는 여러 개의 인터페이스를 구현 할 수 있다.)
 */
public interface Authority {

    // public static final 생략
    String DEFAULT_ROLE = "ROLE_USER";

    // public abstract 생략
    String getAuthority();

    // public 생략
    default void printAuthority() {
        System.out.println(DEFAULT_ROLE);
    }

}
