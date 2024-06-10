package com.study.java_study.ch22_예외;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class LoginException extends RuntimeException{

    private String username;

    // 예외 클래스를 만들때 AllArgs 생성자는 Alt + Ins -> Constructor -> 매개변수에 message가 있는 걸로 생성.
    public LoginException(String message, String username) {
        super(message);
        this.username = username;
    }

    public String getErrorMessage() {
        return username + "사용자 이름이 올바르지 않거나 비밀번호가 일치하지 않습니다.";
    }
}
