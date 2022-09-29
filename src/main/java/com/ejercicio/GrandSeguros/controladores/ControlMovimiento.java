package com.ejercicio.GrandSeguros.controladores;

import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.entidades.MovimientoDinero;
import com.ejercicio.GrandSeguros.servicios.ServiciosMovimiento;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ControlMovimiento {

    ServiciosMovimiento servicesMovimiento;

    public ControlMovimiento(ServiciosMovimiento servicesMovimiento){
        this.servicesMovimiento = servicesMovimiento;

    }
    /*@GetMapping("/movements")
    public List<MovimientoDinero> verMovimiento(){
        return this.servicesMovimiento.getListaMovimiento();
    }*/

    @PostMapping("/movements")
    public MovimientoDinero crearMovimiento(@RequestBody MovimientoDinero Mov){
        return this.servicesMovimiento.crearMovimiento(Mov);

    }

    @GetMapping("/movements/{id}")
    public MovimientoDinero VerMovimiento(@PathVariable Long id){
        return this.servicesMovimiento.getMovimiento(id);
    }

    @PatchMapping("/movements/{id}")
    public MovimientoDinero updateMovimiento(@PathVariable Long id, @RequestBody Map<Object, Object> objectMap){
        return this.servicesMovimiento.updateMovimiento(id, objectMap);
    }

    @DeleteMapping("/movements/{id}")
    public MovimientoDinero eliminarMovimiento(@PathVariable(value = "id") Long id){
        return this.servicesMovimiento.eliminarMovimiento(id);
    }
}



