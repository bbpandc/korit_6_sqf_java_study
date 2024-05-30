package com.study.java_study.ch12_추상화03;

// 이 클래스의 객체를 만들지 않을 거라서 abstract(추상클래스)
// 인터페이스를 구현한 인터페이스는 implements 대신 extends 써야함. (같은 것 끼리는 extends)
public abstract class AbstractAuthority implements Authority{

    private String role;

    public AbstractAuthority() {
        role = DEFAULT_ROLE;
    }

    public AbstractAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }

}
