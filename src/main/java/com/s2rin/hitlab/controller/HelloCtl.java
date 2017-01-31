package com.s2rin.hitlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by surin on 2017. 2. 1..
 */

@Controller
public class HelloCtl {
    @RequestMapping("/index")
    public String index (@RequestParam(value = "requestURL", required = false, defaultValue = "example")String requestURL, Model model){
        model.addAttribute("requestURL", requestURL);

        return "index";
    }
}
