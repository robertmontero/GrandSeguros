package com.ejercicio.GrandSeguros.controladores;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.entidades.MovimientoDinero;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpleado;
import com.ejercicio.GrandSeguros.servicios.ServiciosEmpresa;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

import java.util.List;
import java.util.Map;

@Controller

public class FrontControlador {

    ServiciosEmpresa servicesEmp;
    public FrontControlador(ServiciosEmpresa servicesEmp, ServiciosEmpleado servicesEmpleado){
        this.servicesEmp = servicesEmp;
        this.servicesEmpleado= servicesEmpleado;
    }

    ServiciosEmpleado servicesEmpleado;
    /*public FrontControlador(ServiciosEmpleado servicesEmpleado){
        this.servicesEmpleado = servicesEmpleado;
    }*/

    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal OidcUser principal) {
        if (principal != null) {
            Empleado empleado = this.servicesEmpleado.getOrCreateUser(principal.getClaims());
        }
        return "login";
    }



    @GetMapping("/menu")
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

  @GetMapping("/enterprises/{id}")
    public String updateEmpresa(@PathVariable Long id, Model model){
        Empresa buscarEmpresa = this.servicesEmp.getEmpresa(id);
        model.addAttribute("buscarEmpresa", buscarEmpresa);
        return "update-empresa";
    }

    /*@GetMapping("/users")
    public String  users(){
        return "users";
    }

    /*@GetMapping("/users/search")
    public String  empleado(Model modelus){
        List<Empleado> empleado = this.servicesEmpleado.getListaEmpleado();
        modelus.addAttribute("empleado",empleado);
        return "consultar-usuario";
    }


    @GetMapping("/users/new")
    public String crearempleado(Model modelusu){
        modelusu.addAttribute("empleado", new Empleado());
        return "crear-usuario";

    }*/

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
