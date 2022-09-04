package com.ejercicio.GrandSeguros.controladores;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.MovimientoDinero;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpleado;
import com.ejercicio.GrandSeguros.servicios.ServiciosMovimiento;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlMovimiento {

    ServiciosMovimiento servicesMovimiento;

    public ControlMovimiento(){
        this.servicesMovimiento = new ServiciosMovimiento();

    }
    @GetMapping("/movements")
    public MovimientoDinero verMovimiento(){
        return this.servicesMovimiento.getMovimiento1();
    }
}
