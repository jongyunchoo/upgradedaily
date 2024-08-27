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
public class CommentEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String detail;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public CommentEntity(String detail){
        this.detail = detail;
    }
    public void update(String detail) {
        this.detail = detail;
    }
    @OneToMany(mappedBy = "comment")
    public List<DailyEntity> dailies = new ArrayList<>();


}
