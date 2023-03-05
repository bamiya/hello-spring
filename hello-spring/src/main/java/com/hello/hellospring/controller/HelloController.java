package com.hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello") // 웹앱에서 hello로 들어오면 여기를 호출해줌
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello"; //리턴값의 hello는 템플릿의 hello.html의 이름인 hello이다.
    }
    @GetMapping("bye")
    public String bye(Model model){
        model.addAttribute("data", "bye");
        return "bye";
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }
}
