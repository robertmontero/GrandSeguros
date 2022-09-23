package com.ejercicio.GrandSeguros.controladores;

import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpresa;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class ControlEmpresa{

   ServiciosEmpresa servicesEmp;

    public ControlEmpresa(ServiciosEmpresa servicesEmp){
        this.servicesEmp = servicesEmp;
    }


    @GetMapping("/enterprises")
    public List<Empresa> VerEmpresas(){
        return this.servicesEmp.getListaEmpresas();
    }


       @PostMapping("/enterprises")
       public Empresa crearEmpresa(@RequestBody Empresa emp){
        return this.servicesEmp.crearEmpresa(emp);

       }

    @GetMapping("/enterprises/{id}")
    public Empresa VerEmpresa(@PathVariable Long id){
        return this.servicesEmp.getEmpresa(id);
    }


    @PatchMapping("/enterprises/{id}")
    public Empresa updateEmpresa(@PathVariable Long id, @RequestBody Map<Object, Object> objectMap){
        return this.servicesEmp.updateEmpresa(id, objectMap);
    }


    @DeleteMapping("/enterprises/{id}")
    public Empresa eliminarEmpresa(@PathVariable(value = "id") Long id){
        return this.servicesEmp.eliminarEmpresa(id);
    }


}





