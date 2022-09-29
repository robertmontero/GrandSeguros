package com.ejercicio.GrandSeguros.repositorios;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioEmpleado extends JpaRepository<Empleado,Long> {


    Empleado findByemail(String email);
}
