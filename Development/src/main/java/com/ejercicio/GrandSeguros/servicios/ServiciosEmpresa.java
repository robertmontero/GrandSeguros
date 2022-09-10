package com.ejercicio.GrandSeguros.servicios;

import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.repositorios.repositorioEmpresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServiciosEmpresa {

   private repositorioEmpresa repositorioEmp;

    List<Empresa> listaEmpresas;

    public ServiciosEmpresa(repositorioEmpresa repositorioEmp) {
        this.repositorioEmp = repositorioEmp;
    }

    public List<Empresa> getListaEmpresas() {
        return this.repositorioEmp.findAll();
    }

    public Empresa crearEmpresa(Empresa nuevaEmpresa){
        return this.repositorioEmp.save(nuevaEmpresa);
    }

    public Empresa getEmpresa(Long id){
        return this.repositorioEmp.findById(id).get();
        }

    public Empresa updateEmpresa(Long id, String emp) {
        Empresa EmpresaActual = repositorioEmp.findById(id).get();
        EmpresaActual.setNit(EmpresaActual.getNit());
        EmpresaActual.setNombreEmpresa(EmpresaActual.getNombreEmpresa());
        EmpresaActual.setDireccion(EmpresaActual.getDireccion());
        EmpresaActual.setTelefono(EmpresaActual.getTelefono());
        return this.repositorioEmp.save(EmpresaActual);
    }

    //método para actualizar
    /*public Empresa updateEmpresa(Long id, Empresa emp){
        Empresa EmpresaActual = repositorioEmp.findById(id).get();
        EmpresaActual.setNit(emp.getNit());
        EmpresaActual.setNombreEmpresa(emp.getNombreEmpresa());
        EmpresaActual.setDireccion(emp.getDireccion());
        EmpresaActual.setTelefono(emp.getTelefono());
        return this.repositorioEmp.save(EmpresaActual);
    }*/

       public Empresa eliminarEmpresa(Long id){
        Empresa empresaActual = repositorioEmp.findById(id).orElseThrow();
        this.repositorioEmp.deleteById(id);
        return empresaActual;
    }

}