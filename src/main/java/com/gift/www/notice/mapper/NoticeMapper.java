package com.gift.www.notice.mapper;

import com.gift.www.notice.dto.NoticeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    List<NoticeDto> selectNoticeList() throws Exception;

    void insertNotice(NoticeDto notice) throws Exception;
}
