package com.jenkinsgit.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {

    @GetMapping("/testjenkin")
    public ResponseEntity<String> getEmpDetail(){


        return ResponseEntity.ok("Jenkin Project pass");


    }


}
