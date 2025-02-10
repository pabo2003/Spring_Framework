package org.example.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("path")
public class PathVariablesMappingController {
    @GetMapping(path = "{id}")
    public String test1(@PathVariable("id") String id) {
        return  id;
    }
    @PostMapping(path = "/{id}/{name}")
    public String test(@PathVariable("id") String id,@PathVariable("name") String name){
        return id + " " + name;
    }
}
