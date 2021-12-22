package com.mvc.choinsuk.servlet.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mvc.choinsuk.servlet.request.dto.BasicRequestBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/request")
@RequiredArgsConstructor
public class RestRequestParam {
    private final ObjectMapper objectMapper;

    @GetMapping("/param")
    public void service(@RequestParam(value = "username") String username,
                        @RequestParam(value = "age", required = false) int age) {

        System.out.println("username: " + username);
        System.out.println("age: " + age);
    }

    @PostMapping("/param")
    public ResponseEntity<String> service(@RequestBody BasicRequestBody requestBody) throws JsonProcessingException {
        System.out.println("requestBody = " + requestBody);
        System.out.println("username = " + requestBody.getUsername());
        System.out.println("age = " + requestBody.getAge());

        String responseObj = objectMapper.writeValueAsString(requestBody);

        return ResponseEntity.ok().body(responseObj);
    }
}
