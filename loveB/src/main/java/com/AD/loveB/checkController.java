package com.AD.loveB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class checkController {
    @GetMapping("/check")
    public String check(){
        return "<h3>Server is running</h3>";
    }
}
