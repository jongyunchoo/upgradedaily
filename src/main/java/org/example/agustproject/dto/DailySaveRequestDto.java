package org.example.agustproject.dto;

import lombok.Getter;

@Getter
public class DailySaveRequestDto {

    private Long id;
    private String dailytitle;
    private String dailydetail;

    public DailySaveRequestDto(Long id, String dailytitle, String dailydetail){
        this.id = id;
        this.dailytitle = dailytitle;
        this.dailydetail = dailydetail;
    }

}
