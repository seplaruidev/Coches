package com.gestion.coches.repository;

import com.gestion.coches.models.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
