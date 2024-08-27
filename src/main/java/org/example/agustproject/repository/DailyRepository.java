package org.example.agustproject.repository;

import org.example.agustproject.entity.DailyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyRepository extends JpaRepository<DailyEntity,Long> {
}
