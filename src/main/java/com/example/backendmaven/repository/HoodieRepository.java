package com.example.backendmaven.repository;

import com.example.backendmaven.entity.Hoodie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoodieRepository extends JpaRepository<Hoodie, Long> {

}
