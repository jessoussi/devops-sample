package org.devops.sample.devopssample.exposition.controller;

import org.devops.sample.devopssample.exposition.dto.HelloResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class SampleController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/message")
    public ResponseEntity<HelloResponseDto> message(){
        return ResponseEntity.ok(new HelloResponseDto("Hello"));
    }
}
