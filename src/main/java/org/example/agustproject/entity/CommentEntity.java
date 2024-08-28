package org.example.agustproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class CommentEntity extends Timestamped {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String detail;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "daily_id")
    private DailyEntity daily;

    public CommentEntity(String detail, DailyEntity daily){
        this.detail = detail;
        this.daily = daily;
    }
    public void update(String detail) {
        this.detail = detail;
    }



}
