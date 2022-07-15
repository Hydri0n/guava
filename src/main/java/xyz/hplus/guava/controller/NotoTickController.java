package xyz.hplus.guava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notoTick")
public class NotoTickController {

    @GetMapping("/test")
    public String test() {
        return "Hello!";
    }

}
