package com.example.gesipan.board;

import lombok.Data;

import java.util.Date;

@Data
public class BoardDto {
    private String title;

    private String boardType;

    private String content;

    private String subContent;

    private Date createdAt;

    private Date updatedAt;
}
