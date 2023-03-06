package com.thoughtworks.productpricing.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }
}
