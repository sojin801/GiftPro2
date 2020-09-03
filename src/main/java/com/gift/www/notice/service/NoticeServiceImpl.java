package com.gift.www.notice.service;

import com.gift.www.notice.dto.NoticeDto;
import com.gift.www.notice.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<NoticeDto> selectNoticeList() throws Exception {
        return noticeMapper.selectNoticeList();
    }

    @Override
    public void insertNotice(NoticeDto notice) throws Exception {
        noticeMapper.insertNotice(notice);
    }
}
