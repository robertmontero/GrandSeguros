package com.ejercicio.GrandSeguros.controladores;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.entidades.MovimientoDinero;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpleado;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpresa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class FrontControladorEmpleado {



     ServiciosEmpleado servicesEmpleado;
    public FrontControladorEmpleado(ServiciosEmpleado servicesEmpleado){
        this.servicesEmpleado = servicesEmpleado;
    }



    @GetMapping("/users")
    public String  users(){
        return "users";
    }

    @GetMapping("/users/search")
    public String  empleado(Model modelus){
        List<Empleado> empleado = this.servicesEmpleado.getListaEmpleado();
        modelus.addAttribute("empleado",empleado);
        return "consultar-usuario";
    }


    @GetMapping("/users/new")
    public String crearempleado(Model modelusu){
        modelusu.addAttribute("empleado", new Empleado());
        return "crear-usuario";

    }



}
