package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by user on 19/05/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/coucou")
    @ResponseBody
    public String execute() {
        return "Hello";
    }
}
