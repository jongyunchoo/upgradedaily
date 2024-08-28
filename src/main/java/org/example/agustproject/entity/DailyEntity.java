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
public class DailyEntity extends Timestamped {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dailytitle;
    private String dailydetail;


    @OneToMany(mappedBy = "daily", cascade = CascadeType.REMOVE )
    public List<CommentEntity> comments = new ArrayList<>();

    public DailyEntity(Long id, String dailytitle, String dailydetail) {
        this.id=id;
        this.dailytitle = dailytitle;
        this.dailydetail = dailydetail;
    }

    public void updateDaily(String dailytitle, String dailydetail){
        this.dailytitle = dailytitle;
        this.dailydetail = dailydetail;
    }


}
