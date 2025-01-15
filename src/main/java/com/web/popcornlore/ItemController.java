package com.web.popcornlore;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor //롬복 쓰려면 있어야 함
public class ItemController {


    private final ItemRepository itemRepository;

    //JPA로 데이터 입출력하기
//      1. repository 만들기
//      2. 원하는 클래스에 repository 등록
//      3. repository.입출력문법() 쓰기

    @GetMapping("/list")
    String list(Model model){

        var result=itemRepository.findAll();  // .findAll()은 테이블의 모든 데이터를 가져다줌
        System.out.println(result);
//      itemRepository.save(??);  // .save()은 테이블에 데이터를 넣어줌. 이런식으로 함수 갖다쓸 수 있음
//        model.addAttribute("전달할데이터 이름","전달할 데이터");
        model.addAttribute("name","홍길동");
        return "list.html";

    }




}
