package com.web.popcornlore;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.*;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

//    @GetMapping("/list")
//    String list(Model model){
////        model.addAttribute("전달할데이터 이름","전달할 데이터");
//        Scanner itemRepository;
////        List<Item> result = itemRepository.findAll();
//        model.addAttribute("name","홍길동");
//        return "list.html";
//    }

    @GetMapping("/list")
    String list(Model model){
        var result=itemRepository.findAll();
        System.out.println(result.get(0).title);
        System.out.println(result.get(0).price);
        
        //id,title,price값 뽑아줌
        //Item클래스의 @toString 사용
        var a = new Item();
        System.out.println(a);

        model.addAttribute("items",result);
        return "list.html";
    }

    @GetMapping("/write")
    String write(){
        return "write.html";
    }

    @PostMapping("/add") // url작명시 명사가 좋음!
    String addPost(@RequestParam String title,
                   @RequestParam Integer price){ //여기 적은 타입은, 적은대로 타입을 변환해달라는 것이기 때문에, 변환 원하는거 맘대로 집어넣으쇼
//        System.out.println(title);
//        System.out.println(price);
//        new Item()
//        itemRepository.save(???);  //Item테이블에 행으로 넣어줌 , 괄호 안에는 Item의 object를 넣어야 함
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
