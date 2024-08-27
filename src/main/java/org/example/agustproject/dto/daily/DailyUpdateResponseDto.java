package org.example.agustproject.dto.daily;

import lombok.Getter;

@Getter
public class DailyUpdateResponseDto {
    private final Long id;
    private final String dailytitle;
    private final String dailydetail;

    public DailyUpdateResponseDto(Long id, String dailytitle, String dailydetail){
        this.id = id;
        this.dailytitle = dailytitle;
        this.dailydetail =dailydetail;
    }

}
