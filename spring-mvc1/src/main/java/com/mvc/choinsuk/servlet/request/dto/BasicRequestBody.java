package com.mvc.choinsuk.servlet.request.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BasicRequestBody {
    private String username;
    private int age;

    @Builder
    public BasicRequestBody(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
