package com.example.backendmaven.repository;

import com.example.backendmaven.entity.tShirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tShirtRepository extends JpaRepository<tShirt, Long> {

}
