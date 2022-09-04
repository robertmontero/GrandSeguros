package com.ejercicio.GrandSeguros.servicios;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.MovimientoDinero;

public class ServiciosMovimiento {


    MovimientoDinero movimiento1;

    public ServiciosMovimiento() {
        this.movimiento1 = new MovimientoDinero(1, 100.0, "0", "0", "0");
    }

    public MovimientoDinero getMovimiento1() {
        return movimiento1;
    }

}
