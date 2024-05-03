package com.OSS.testJenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String Home() {
        return "오픈소스입문 팀F Jenkins 두번째 테스트입니다.";
    }
}
