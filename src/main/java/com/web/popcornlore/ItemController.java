package com.web.popcornlore;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ItemController {

    @GetMapping("/list")
    String list(Model model){
//        model.addAttribute("전달할데이터 이름","전달할 데이터");
        model.addAttribute("name","홍길동");
        return "list.html";
    }

    @GetMapping("/write")
    String write(){
        return "write.html";
    }

    @PostMapping("/add") // url작명시 명사가 좋음!
    String addPost(@RequestParam String title,
                   @RequestParam Integer price){
        System.out.println(title);
        System.out.println(price);
        return "redirect:/list";
    }

    // Map 사용해보기
//    @PostMapping("/add")
//    String addPost(@RequestParam Map formData){
//
//        HashMap<String,Object> test = new HashMap<>();
//        //데이터 넣기, 리스트랑 큰 차이점은, 데이터(value)를 넣을때 데이터의 이름(key)을 넣어줘야함
//        test.put("name","kim");     //arratList에선 .add
//        test.put("age",20);
//        System.out.println(test.get("name"));
//        return "redirect:/list";
//    }

    @GetMapping("/writePost")
    String writePost(String title, Integer price){
        Item item=new Item();
        item.setTitle(title);
        item.setPrice(price);
        //itemRepository.save(item); 오류해결하기
        return "redirect:/list";
    }




}
