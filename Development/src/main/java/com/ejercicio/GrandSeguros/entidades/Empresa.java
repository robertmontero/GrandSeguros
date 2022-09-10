package com.ejercicio.GrandSeguros.entidades;

import javax.persistence.*;

@Entity
@Table (name="empresa")

public class Empresa {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@Column (name="idEmpresa")
    private long idEmpresa;

    @Column (name="nombreEmpresa")
    private String nombreEmpresa;
    @Column (name="nit")
    private String nit;
    @Column (name="direccion")
    private String direccion;
    @Column (name="telefono")
    private String telefono;

    public Empresa(){

    }

    public Empresa(Long idEmpresa, String nombreEmpresa, String nit, String direccion, String telefono) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
    }

        public void setIdEmpresa(Long idEmpresa) {

        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
