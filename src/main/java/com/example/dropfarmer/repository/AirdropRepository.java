package com.example.dropfarmer.repository;

import com.example.dropfarmer.model.entity.AirdropEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirdropRepository extends JpaRepository<AirdropEntity,Long> {
}
