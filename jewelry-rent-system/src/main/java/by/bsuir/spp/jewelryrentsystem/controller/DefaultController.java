package by.bsuir.spp.jewelryrentsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class DefaultController {

    @GetMapping
    public String helloSpring() {
        return "Hello, Spring!!!";
    }
}
