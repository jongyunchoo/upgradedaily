package org.example.agustproject.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class DailySimpleResponseDto {


    private Long id;
    private String dailytitle;
    private String dailydetail;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public DailySimpleResponseDto(Long id, String dailytitle,String dailydetail,LocalDateTime createdAt,LocalDateTime modifiedAt) {
        this.id = id;
        this.dailytitle = dailytitle;
        this.dailydetail = dailydetail;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
