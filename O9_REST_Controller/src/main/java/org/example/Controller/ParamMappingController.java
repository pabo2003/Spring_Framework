package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("param")
public class ParamMappingController {

    @GetMapping(params = {"id","name"})
    public String test(@RequestParam("id") String id,@RequestParam("name") String name){
        return id + " " + name;
    }

}
