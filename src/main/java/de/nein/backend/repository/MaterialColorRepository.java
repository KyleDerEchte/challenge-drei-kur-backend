package de.nein.backend.repository;

import de.nein.backend.entity.MaterialColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialColorRepository extends JpaRepository<MaterialColor, Long> {
}
