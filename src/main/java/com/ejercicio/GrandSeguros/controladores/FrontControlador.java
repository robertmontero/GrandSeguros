package com.ejercicio.GrandSeguros.controladores;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.entidades.MovimientoDinero;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpleado;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpresa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller

public class FrontControlador {

    ServiciosEmpresa servicesEmp;
    public FrontControlador(ServiciosEmpresa servicesEmp){
        this.servicesEmp = servicesEmp;
    }

    /*ServiciosEmpleado servicesEmpleado;
    public FrontControlador(ServiciosEmpleado servicesEmpleado){
        this.servicesEmpleado = servicesEmpleado;
    }*/

    @GetMapping("/")
    public String  index(){
        return "index";
    }

    @GetMapping("/enterprises")
    public String  enterprises(){
        return "enterprises";
    }

    @GetMapping("/enterprises/search")
    public String  empresas(Model modelEmp){
        List<Empresa> empresas = this.servicesEmp.getListaEmpresas();
        modelEmp.addAttribute("empresas",empresas);
        return "consultar-empresas";
    }

    @GetMapping("/enterprises/new")
    public String crearempresa(Model model){
        model.addAttribute("empresa", new Empresa());
        return "crear-empresa";

    }

    @GetMapping("/users")
    public String  users(){
        return "users";
    }

    /*@GetMapping("/users/search")
    public String  empleado(Model modelus){
        List<Empleado> empleado = this.servicesEmpleado.getListaEmpleado();
        modelus.addAttribute("empleado",empleado);
        return "consultar-usuario";
    }*/


    @GetMapping("/users/new")
    public String crearempleado(Model modelusu){
        modelusu.addAttribute("empleado", new Empleado());
        return "crear-usuario";

    }

    @GetMapping("/movements")
    public String  movements(){
        return "movements";
    }

    @GetMapping("/movements/new")
    public String crearmovimiento(Model modelmov){
        modelmov.addAttribute("movimiento", new MovimientoDinero());
        return "crear-movimiento";

    }


    /*@GetMapping("/enterprises/[id]/movements")
    public String  movements(){
        return "movements";
        }
*/



}
