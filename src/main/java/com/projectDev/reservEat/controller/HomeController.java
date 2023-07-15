package com.projectDev.reservEat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    //기본페이지 요청 메서드
    @GetMapping("/") //요청하면
        public String index(){ //이 메소드 호출
            return "reservEat"; // => templates폴더의 index.html을 찾아감
        }
}
