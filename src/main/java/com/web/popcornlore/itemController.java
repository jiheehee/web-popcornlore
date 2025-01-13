package com.web.popcornlore;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class itemController {

    @GetMapping("/list")
    String list(Model model){
//        model.addAttribute("전달할데이터 이름","전달할 데이터");
        model.addAttribute("name","홍길동");
        return "list.html";

    }




}
