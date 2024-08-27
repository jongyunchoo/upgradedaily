package org.example.agustproject.dto.comment;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentSimpleResponseDto {

    private final String detail;



    public CommentSimpleResponseDto ( String detail){

        this.detail = detail;


    }



}
