package com.example.dropfarmer.repository;

import com.example.dropfarmer.model.entity.StrategyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrategyRepository extends JpaRepository<StrategyEntity,Long> {
}
