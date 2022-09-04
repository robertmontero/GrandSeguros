package com.ejercicio.GrandSeguros.controladores;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpleado;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEmpleado {

    ServiciosEmpleado servicesEmpleado;

    public ControlEmpleado(){
        this.servicesEmpleado = new ServiciosEmpleado();
    }
    @GetMapping("/users")
    public Empleado verEmpleado(){
        return this.servicesEmpleado.getEmpleado1();
    }

}





