package com.ejercicio.GrandSeguros.repositorios;

import com.ejercicio.GrandSeguros.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioEmpresa extends JpaRepository<Empresa, Long> {

}
