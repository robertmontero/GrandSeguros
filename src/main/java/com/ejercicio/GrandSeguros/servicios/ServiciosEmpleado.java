package com.ejercicio.GrandSeguros.servicios;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.repositorios.repositorioEmpleado;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServiciosEmpleado {

    private repositorioEmpleado repositorioUsu;

    List<Empleado> listaEmpleado;

    public ServiciosEmpleado(repositorioEmpleado repositorioUsu) {
        this.repositorioUsu = repositorioUsu;
    }

    public List<Empleado> getListaEmpleado() {
        return this.repositorioUsu.findAll();
    }


    public Empleado crearEmpleado(Empleado nuevoEmpleado){
        return this.repositorioUsu.save(nuevoEmpleado);
    }


    public Empleado findUserByEmail(String email){
        return this.repositorioUsu.findByemail(email);

    }

    public Empleado getOrCreateUser(Map<String, Object> userData){
        String email = (String) userData.get("email");
        Empleado empleado = findUserByEmail(email);
        if(empleado==null){

        String nombreEmpleado = (String) userData.get("name");
        String auth0Id = (String) userData.get("sub");


        }
        System.out.println(empleado.getEmail());
    return empleado;
    }

    public Empleado getEmpleado(Long id){
        return this.repositorioUsu.findById(id).get();
    }

    public Empleado updateEmpleado(Long id, Map<Object, Object> objectMap) {
        Empleado EmpleadoActual = repositorioUsu.findById(id).get();
        objectMap.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(Empleado.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, EmpleadoActual, value);
        });
        return repositorioUsu.save(EmpleadoActual);
    }

    public Empleado eliminarEmpleado(Long id){
        Empleado empleadoActual = repositorioUsu.findById(id).orElseThrow();
        this.repositorioUsu.deleteById(id);
        return empleadoActual;
    }

}
