package org.example.agustproject.repository;

import org.example.agustproject.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    List<CommentRepository> findByDailyId(Long id);
}
