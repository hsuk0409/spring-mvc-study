package com.mvc.choinsuk.servlet.request;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/request")
public class RestRequestParam {

    @GetMapping("/param")
    public void service(@RequestParam(value = "username") String username,
                        @RequestParam(value = "age", required = false) int age) {

        System.out.println("username: " + username);
        System.out.println("age: " + age);
    }
}
