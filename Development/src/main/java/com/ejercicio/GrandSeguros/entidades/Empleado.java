package com.ejercicio.GrandSeguros.entidades;

import javax.persistence.*;

@Entity
@Table (name="empleado")

public class Empleado {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long Id;
    @Column (name="numIdentificacion")
    private String numIdentificacion;
    @Column (name="nombreEmpleado")
    private String nombreEmpleado;
    @Column (name="correoEmpleado")
    private String correoEmpleado;
    @Column (name="nombreEmpresa")
    private String nombreEmpresa;
    @Column (name="rolEmpleado")
    private String rolEmpleado;

    public Empleado() {
    }

    public Empleado(String numIdentificacion, String nombreEmpleado, String correoEmpleado, String nombreEmpresa, String rolEmpleado) {
        this.setNumIdentificacion(numIdentificacion);
        this.setNombreEmpleado(nombreEmpleado);
        this.setCorreoEmpleado(correoEmpleado);
        this.setNombreEmpresa(nombreEmpresa);
        this.setRolEmpleado(rolEmpleado);
    }


    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}



