package com.ejercicio.GrandSeguros.servicios;

import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.entidades.MovimientoDinero;
import com.ejercicio.GrandSeguros.repositorios.repositorioMovimiento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosMovimiento {


   private repositorioMovimiento repositoriomovi;

    List<MovimientoDinero> listaMovimiento;

    public ServiciosMovimiento(repositorioMovimiento repositoriomovi) {
        this.repositoriomovi = repositoriomovi;
    }

    public List<MovimientoDinero> getListaMovimiento() {
        return this.repositoriomovi.findAll();
    }

    public MovimientoDinero crearMovimiento(MovimientoDinero nuevoMovimiento){
        return this.repositoriomovi.save(nuevoMovimiento);

    }

    public MovimientoDinero getMovimiento(Long id){
        return this.repositoriomovi.findById(id).get();
    }

    public MovimientoDinero eliminarMovimiento(Long id){
        MovimientoDinero MovimientoActual = repositoriomovi.findById(id).orElseThrow();
        this.repositoriomovi.deleteById(id);
        return MovimientoActual;
    }
}
