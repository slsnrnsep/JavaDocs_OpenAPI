package com.example.demoproject.controller;

import com.example.demoproject.controller.dto.UserResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @GetMapping("{sampleId}")
    public UserResponseDto getSampleById(@PathVariable String sampleId) {
        return new UserResponseDto(sampleId, "sample-$sampleId");
    }
}
