package com.projectDev.reservEat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    //회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String savaForm(){
        return "save";
    }

    @PostMapping("/member/save")
    public String save(@RequestParam("memberEmail")String memberEmail,
                       @RequestParam("memberPassword")String memberPassword,
                       @RequestParam("memberName")String memberName){ //request로 가져온 값을 String 변수에 옮겨담음
        System.out.println("MemberController.save");
        System.out.println("memberEmail = " + memberEmail + ", memberPassword = " + memberPassword + ", memberName = " + memberName);
        return "reservEat";
    }
}
