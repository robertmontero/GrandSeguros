package com.ejercicio.GrandSeguros.servicios;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.Empresa;

public class ServiciosEmpleado {

    Empleado empleado1;

    public ServiciosEmpleado() {
        this.empleado1 = new Empleado("1", "usuario", "usuario@usuario.com", "emp", "operativo");


    }

    public Empleado getEmpleado1() {
        return empleado1;
    }
}
