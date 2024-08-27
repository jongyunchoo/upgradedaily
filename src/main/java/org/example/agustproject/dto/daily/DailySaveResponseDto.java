package org.example.agustproject.dto.daily;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class DailySaveResponseDto {

    private Long id;
    private String dailytitle;
    private String dailydetail;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public DailySaveResponseDto(Long id, String dailytitle,String dailydetail,LocalDateTime createdAt,LocalDateTime modifiedAt){
        this.id = id;
        this.dailytitle = dailytitle;
        this.dailydetail = dailydetail;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;

    }
}
