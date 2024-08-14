package com.rtt.perscholas.Glab3092.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    private String Elizabeth(){
        return "Elizabeth";
    }
}
