package com.rest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hola")
    public String welcome() {
        return "Hola este es mi prueba Render";
    }
}
