package com.ejercicio.GrandSeguros.servicios;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.repositorios.repositorioEmpleado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosEmpleado {

    private repositorioEmpleado repositorioUsu;

    List<Empleado> listaEmpleado;

    public ServiciosEmpleado(repositorioEmpleado repositorioUsu) {
        this.repositorioUsu = repositorioUsu;
    }

    public List<Empleado> getListaEmpleado() {
        return this.repositorioUsu.findAll();
    }


    public Empleado crearEmpleado(Empleado nuevoEmpleado){
        return this.repositorioUsu.save(nuevoEmpleado);
    }

    public Empleado getEmpleado(Long id){
        return this.repositorioUsu.findById(id).get();
    }

    public Empleado eliminarEmpleado(Long id){
        Empleado empleadoActual = repositorioUsu.findById(id).orElseThrow();
        this.repositorioUsu.deleteById(id);
        return empleadoActual;
    }

}
