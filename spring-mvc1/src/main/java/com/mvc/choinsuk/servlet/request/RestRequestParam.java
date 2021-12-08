package com.mvc.choinsuk.servlet.request;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @PostMapping("/param")
    public String service(@RequestBody Map<String, String> requestBody) {
        System.out.println("requestBody = " + requestBody);
        System.out.println("username = " + requestBody.get("username"));
        System.out.println("age = " + requestBody.get("age"));

        return "200 OK";
    }
}
