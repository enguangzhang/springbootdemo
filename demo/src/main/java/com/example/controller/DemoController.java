package com.example.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DemoController
 * @Decription: TODO
 * @Author: ZEG
 * @date: 2018/11/27 11:14
 */
@RestController()
@EnableAutoConfiguration
public class DemoController {
    @RequestMapping("/getString")
    public String getString(){
        return "getString";
    }
}
