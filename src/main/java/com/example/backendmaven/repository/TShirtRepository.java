package com.example.backendmaven.repository;

import com.example.backendmaven.entity.TShirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TShirtRepository extends JpaRepository<TShirt, Long> {

}
