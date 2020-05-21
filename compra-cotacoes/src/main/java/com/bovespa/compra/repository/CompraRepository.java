package com.bovespa.compra.repository;

import com.bovespa.compra.model.CompraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<CompraEntity, Long> {
}
