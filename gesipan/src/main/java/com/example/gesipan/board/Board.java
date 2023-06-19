package com.example.gesipan.board;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;


@Data
@Entity(name = "ksh2104")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String boardType;

    private String content;

    private String subContent;


    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdAt = new Date();

    @LastModifiedDate
    private LocalDateTime updatedAt;

}
