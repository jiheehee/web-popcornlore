package com.web.popcornlore;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class NoticeController {

//@RequiredArgsConstructor 이거 안쓰면 Constructor 생성자 사용해줘야 함
//    public NoticeController(NoticeRepository noticeRepository) {
//        this.noticeRepository = noticeRepository;
//    }

    private final NoticeRepository noticeRepository;

    Notice notice = new Notice();

    @GetMapping("/notice")
    String notice(Model model){

        List result=noticeRepository.findAll();
        System.out.println(result);
        System.out.println(result.get(1));

        model.addAttribute("notice",result);

        return "/notice.html";

    }


}
