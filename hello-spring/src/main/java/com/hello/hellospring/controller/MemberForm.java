package com.hello.hellospring.controller;

import com.hello.hellospring.domain.Member;
import com.hello.hellospring.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

public class MemberForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
