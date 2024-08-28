package org.example.agustproject.dto.daily;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class DailySimpleResponseDto {


    private Long id;
    private String dailytitle;
    private String dailydetail;


    public DailySimpleResponseDto(Long id, String dailytitle,String dailydetail) {
        this.id = id;
        this.dailytitle = dailytitle;
        this.dailydetail = dailydetail;


    }
}
