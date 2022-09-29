package com.ejercicio.GrandSeguros.controladores;

import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpresa;

import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Map;


@RestController
public class ControlEmpresa{

   ServiciosEmpresa servicesEmp;

    public ControlEmpresa(ServiciosEmpresa servicesEmp){
        this.servicesEmp = servicesEmp;
    }


    /*@GetMapping("/enterprises")
    public List<Empresa> VerEmpresas(){
        return this.servicesEmp.getListaEmpresas();
    }*/


       @PostMapping("/enterprises")
       public RedirectView crearEmpresa(@ModelAttribute Empresa emp, Model model){
           model.addAttribute((emp));
           this.servicesEmp.crearEmpresa(emp);
           return new RedirectView("/enterprises");

       }

    /*@GetMapping("/enterprises/{id}")
    public Empresa VerEmpresa(@PathVariable Long id){
        return this.servicesEmp.getEmpresa(id);
    }*/


    @PatchMapping("/enterprises/{id}")
    public Empresa updateEmpresa(@PathVariable Long id, @RequestBody Map<Object, Object> objectMap){
        return this.servicesEmp.updateEmpresa(id, objectMap);
    }


    @DeleteMapping("/enterprises/{id}")
    public Empresa eliminarEmpresa(@PathVariable(value = "id") Long id){
        return this.servicesEmp.eliminarEmpresa(id);
    }


}





