package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    public HelloController() {
        System.out.println("HelloController Constructor");
    }

    @GetMapping("/world"  )
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/test")
    public String test(){
        return "Test";
    }
}
