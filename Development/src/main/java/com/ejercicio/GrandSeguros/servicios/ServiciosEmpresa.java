package com.ejercicio.GrandSeguros.servicios;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.Empresa;

import java.util.ArrayList;
import java.util.List;

public class ServiciosEmpresa {

    Empresa empresa1;
    Empresa empresa2;

    List<Empresa> listaEmpresas;

    ServiciosEmpleado emp =new ServiciosEmpleado();
    public ServiciosEmpresa(){

        this.empresa1 = new Empresa(0,"0","0","0","0");
        this.empresa2 = new Empresa(1,"GrandSeguros","100254","av siempre viva","6514242");

        this.listaEmpresas =new ArrayList<>();
        listaEmpresas.add(empresa1);
        listaEmpresas.add(empresa2);
    }

    public List<Empresa> getListaEmpresas(){
        return this.listaEmpresas;

    }

    public Empresa getEmpresa1() {
        return empresa2;
    }
}
