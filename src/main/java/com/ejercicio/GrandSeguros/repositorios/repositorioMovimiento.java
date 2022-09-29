package com.ejercicio.GrandSeguros.repositorios;

import com.ejercicio.GrandSeguros.entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioMovimiento extends JpaRepository<MovimientoDinero, Long> {



}
