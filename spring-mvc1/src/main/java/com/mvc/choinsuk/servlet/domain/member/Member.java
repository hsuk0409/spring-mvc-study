package com.mvc.choinsuk.servlet.domain.member;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Member {

    private Long id;
    private String username;
    private int age;

    public void updateId(long userId) {
        this.id = userId;
    }

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
