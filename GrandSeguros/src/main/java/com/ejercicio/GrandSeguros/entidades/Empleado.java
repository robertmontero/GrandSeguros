package com.ejercicio.GrandSeguros.entidades;

import javax.persistence.*;

@Entity
@Table (name="empleado")

public class Empleado {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long Id;
    @Column (name="numIdentificacion", unique = true)
    private String numIdentificacion;
    @Column (name="nombreEmpleado")
    private String nombreEmpleado;

    @Column (name="email",unique = true)
    private String email;
    @Column (name="nombreEmpresa")
    private String nombreEmpresa;
    @Column (name="rolEmpleado")
    private String rolEmpleado;

    @Column (name="auth0Id", unique = true )
    private String auth0Id;

    @ManyToOne(optional = true)
    @JoinColumn(name="idEmpresa")
    private Empleado empleado;


    public Empleado() {
    }

    public Empleado(String numIdentificacion, String nombreEmpleado, String email, String nombreEmpresa, String rolEmpleado, String auth0Id) {
        this.numIdentificacion = numIdentificacion;
        this.nombreEmpleado= nombreEmpleado;
        this.email= email;
        this.nombreEmpresa= nombreEmpresa;
        this.rolEmpleado= rolEmpleado;
        this.auth0Id= auth0Id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }
}



