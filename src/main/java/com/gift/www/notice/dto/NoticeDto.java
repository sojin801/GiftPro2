package com.gift.www.notice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class NoticeDto {
    private int notice_idx;
    private String notice_title;
    private String notice_content;
    private Date created_date;
}
