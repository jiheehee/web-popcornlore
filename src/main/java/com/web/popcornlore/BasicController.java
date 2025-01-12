package com.web.popcornlore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class BasicController {

    @GetMapping("/")
    @ResponseBody
    String hello(){
        return "<h4>메인페이지입니듀</h4>";
    }

    @GetMapping("/about")
    //return값이 경로일 경우 @ResponseBody는 빼줘야함
    //왜냐면 @ResponseBody를 쓰면 return값을 "문자 그대로 보내주세요" 라는 의미이기 때문!
    //아무것도 안쓰면 "return값에 있는 파일을 보내주세요" 이렇게 요청이 됨
    String about(){
        return "index.html"; // 기본 경로가 static 폴더 -> 아닐경우, 폴더명/파일명
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mypage(){
        return "여기는 마이페이지!";
    }

    @GetMapping("/date")
    @ResponseBody
    String date(){
        return "오늘의 날짜는 "+LocalDateTime.now().toString();
    }



}
