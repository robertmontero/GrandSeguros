package com.ejercicio.GrandSeguros.servicios;

import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.repositorios.repositorioEmpresa;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public Empresa updateEmpresa(Long id, Map<Object, Object>objectMap) {
        Empresa EmpresaActual = repositorioEmp.findById(id).get();
        objectMap.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(Empresa.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, EmpresaActual, value);
                });
        return repositorioEmp.save(EmpresaActual);
    }

        public Empresa eliminarEmpresa(Long id){
        Empresa empresaActual = repositorioEmp.findById(id).orElseThrow();
        this.repositorioEmp.deleteById(id);
        return empresaActual;
    }

}