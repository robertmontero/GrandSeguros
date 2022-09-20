package com.ejercicio.GrandSeguros.controladores;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpleado;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ControlEmpleado {

    ServiciosEmpleado servicesEmpleado;



    public ControlEmpleado(ServiciosEmpleado servicesEmpleado){
        this.servicesEmpleado = servicesEmpleado;

    }
    @GetMapping("/users")
    public List<Empleado> VerUsuarios(){
        return this.servicesEmpleado.getListaEmpleado();
    }

    @PostMapping("/users")
    public Empleado crearEmpleado(@RequestBody Empleado usu){
        return this.servicesEmpleado.crearEmpleado(usu);

    }

    @GetMapping("/users/{id}")
    public Empleado VerUsuario(@PathVariable Long id){
        return this.servicesEmpleado.getEmpleado(id);
    }

    @PatchMapping("/users/{id}")
    public Empleado updateEmpleado(@PathVariable Long id, @RequestBody Map<Object, Object> objectMap){
        return this.servicesEmpleado.updateEmpleado(id, objectMap);
    }

    @DeleteMapping("/users/{id}")
    public Empleado eliminarEmpleado(@PathVariable(value = "id") Long id){
        return this.servicesEmpleado.eliminarEmpleado(id);
    }

}





