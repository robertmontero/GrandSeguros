package com.ejercicio.GrandSeguros.controladores;

import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEmpresa {

   /* @GetMapping("/vista1")
    public String visualizar(){
        return "prime vista";
    }

        @GetMapping("/vista2")
    public Empresa ControlEmpresa(){
        Empresa empresa1 = new Empresa(0,"0","0","0","0");
        return empresa1;
    }*/
    ServiciosEmpresa services;

    public ControlEmpresa(){
        this.services = new ServiciosEmpresa();
    }
    @GetMapping("/enterprises")
    public List<Empresa> verEmpresas(){
        return this.services.getListaEmpresas();
    }

       @GetMapping("/enterprises/{id}")
       public Empresa buscarId(@PathVariable int id){
           return this.services.getEmpresa1();
       }


   }





