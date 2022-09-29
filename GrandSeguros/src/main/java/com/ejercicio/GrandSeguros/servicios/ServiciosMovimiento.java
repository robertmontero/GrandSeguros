package com.ejercicio.GrandSeguros.servicios;

import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.entidades.MovimientoDinero;
import com.ejercicio.GrandSeguros.repositorios.repositorioMovimiento;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

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

    public MovimientoDinero updateMovimiento(Long id, Map<Object, Object> objectMap) {
        MovimientoDinero MovimientoActual = repositoriomovi.findById(id).get();
        objectMap.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(MovimientoDinero.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, MovimientoActual, value);
        });
        return repositoriomovi.save(MovimientoActual);
    }

    public MovimientoDinero eliminarMovimiento(Long id){
        MovimientoDinero MovimientoActual = repositoriomovi.findById(id).orElseThrow();
        this.repositoriomovi.deleteById(id);
        return MovimientoActual;
    }
}
