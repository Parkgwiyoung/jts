package com.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/jts")
    @ResponseBody
    public String index() {
        return "안녕하세요 jts에 오신 것을 환영합니다.";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }
}
