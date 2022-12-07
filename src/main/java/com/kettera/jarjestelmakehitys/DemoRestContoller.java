package com.kettera.jarjestelmakehitys;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/demo")
@RestController
public class DemoRestContoller {

    @GetMapping("/")
    public ResponseEntity<String> getResponse() {
        return ResponseEntity.ok().body("Response");
    }

}
