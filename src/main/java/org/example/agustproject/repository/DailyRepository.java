package org.example.agustproject.repository;

import org.example.agustproject.entity.DailyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyRepository extends JpaRepository<DailyEntity,Long> {
    Page<DailyEntity> findAllByOrderByModifiedAtDesc(Pageable pageable);
}
