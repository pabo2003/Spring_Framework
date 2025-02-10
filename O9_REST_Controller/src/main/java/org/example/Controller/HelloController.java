package org.example.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("say")
    private String sayHello(){
        return "get mapping invoked";
    }

    @GetMapping("say1")
    private String sayHello1(){
        return "get mapping invoked 11111";
    }
//get mapping 2k thiyeddi apit path ekk denn puluwn ("say") me wge ethkota apit run kr gnn oni get method eke mokkd kiyala meken denn puluwn



    @PostMapping
    private String sayHelloPost(){
        return "post mapping invoked";
    }

    @PutMapping
    private String sayHelloPut(){
        return "put mapping invoked";
    }

    @DeleteMapping
    private String sayHelloDelete(){
        return "delete mapping invoked";
    }

    @PatchMapping
    private String sayHelloPatch(){
        return "patch mapping invoked";
    }
}
