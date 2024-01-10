package com.example.studentservice.repository;

import com.example.studentservice.model.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<EtudiantEntity, Long> {
}
