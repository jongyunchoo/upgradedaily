package org.example.agustproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class DailyEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dailytitle;
    private String dailydetail;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public DailyEntity(Long id, String dailytitle, String dailydetail) {
        this.id=id;
        this.dailytitle = dailytitle;
        this.dailydetail = dailydetail;
    }

    public void updateDaily(String dailytitle, String dailydetail){
        this.dailytitle = dailytitle;
        this.dailydetail = dailydetail;
    }

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private CommentEntity comment;
}
