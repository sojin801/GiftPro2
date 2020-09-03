package com.gift.www.notice.service;

import com.gift.www.notice.dto.NoticeDto;

import java.util.List;

public interface NoticeService {

    List<NoticeDto> selectNoticeList() throws Exception;

   void insertNotice(NoticeDto notice) throws Exception;

}
