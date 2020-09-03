package com.gift.www.notice.controller;

import com.gift.www.notice.dto.NoticeDto;
import com.gift.www.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/notice/openNoticeList.do")
    public ModelAndView openNoticeList() throws Exception{
        ModelAndView mv = new ModelAndView("/notice/noticeList");

        List<NoticeDto> list = noticeService.selectNoticeList();
        mv.addObject("list", list);

        return mv;
    }

   @RequestMapping("/notice/openNoticeWrite.do")
    public String openNoticeWrite() throws Exception{
        return "/notice/noticeWrite";
    }

    @RequestMapping("/notice/insertNotice.do")
    public String insertNotice(NoticeDto notice) throws Exception{
        noticeService.insertNotice(notice);
        return "redirect:/notice/openNoticeList.do";
    }


}
