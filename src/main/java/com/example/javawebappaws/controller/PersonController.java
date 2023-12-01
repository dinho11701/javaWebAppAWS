package com.example.javawebappaws.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class PersonController {

    @RequestMapping("/getname")
    public String getName(){
        return "Hasna";
    }

}
