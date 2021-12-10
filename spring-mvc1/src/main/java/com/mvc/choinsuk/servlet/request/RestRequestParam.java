package com.mvc.choinsuk.servlet.request;

import com.mvc.choinsuk.servlet.request.dto.BasicRequestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
    public String service(@RequestBody BasicRequestBody requestBody) {
        System.out.println("requestBody = " + requestBody);
        System.out.println("username = " + requestBody.getUsername());
        System.out.println("age = " + requestBody.getAge());

        return "200 OK";
    }
}
