package com.web.popcornlore;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    //noticeWrite.html에서 공지사항 글쓴거 고대로 noticeWrite.html로 보내기
    @GetMapping("/noticeWrite")
    String noticeWrite(String noticeTitle){
        Notice notice=new Notice();
        notice.setNoticeTitle(noticeTitle);
        return "/noticeWrite";
    }

    @GetMapping("/noticeWritePage")
    String noticeWrtiePage(){
        return "/noticeWrite.html";
    }

    //noticeWrite.html에 있는거 받아서 notice.html로 보내줌 (공지사항 게시판으로 보내줌)
    @PostMapping("/noticeAdd")
    String noticeAdd(@RequestParam Long id,
                     @RequestParam String noticeTitle,
                     @RequestParam String noticeDate){
        return "redirect:/notice";
    }


}
