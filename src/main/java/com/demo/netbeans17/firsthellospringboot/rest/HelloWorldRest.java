/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.netbeans17.firsthellospringboot.rest;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vyor
 */
@RestController
@RequestMapping(value = "/api/hello")
public class HelloWorldRest {

    @GetMapping(value = "/hi")
    public String hi() {
        return "Hi, " + new Date();
    }
    
    public String newMethod(){
        return "newMethod";
    }
}
