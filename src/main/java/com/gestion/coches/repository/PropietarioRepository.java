package com.gestion.coches.repository;

import com.gestion.coches.models.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropietarioRepository extends JpaRepository<Propietario, Long> {
}
