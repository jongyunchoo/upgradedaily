package org.example.agustproject.dto.comment;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentDetailResponseDto {

    private final Long id;
    private final String detail;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    public CommentDetailResponseDto(Long id, String detail, LocalDateTime createdAt, LocalDateTime modifiedAt){
        this.id =id;
        this.detail = detail;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
