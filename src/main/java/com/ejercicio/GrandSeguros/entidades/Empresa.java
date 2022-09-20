package com.ejercicio.GrandSeguros.entidades;

import com.ejercicio.GrandSeguros.servicios.ServiciosEmpresa;

import javax.persistence.*;
import java.util.Set;

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
    private Integer nit;

    @Column (name="telefono")
    private Integer telefono;

    @Column (name="correo")
    private String correo;
    @Column (name="direccion")
    private String direccion;

    @Column (name="direccion2")
    private String direccion2;

    @Column (name="pais")
    private String pais;

    @Column (name="ciudad")
    private String ciudad;

    @Column (name="codigozip")
    private Integer codigozip;




   public Empresa(){

    }

    public Empresa(Long idEmpresa, String nombreEmpresa, Integer nit, String correo, String direccion, Integer telefono , String direccion2, String pais, String ciudad,Integer codigozip ) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.direccion2 = direccion2;
        this.pais = pais;
        this.ciudad = ciudad;
        this.codigozip = codigozip;
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

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCodigozip() {
        return codigozip;
    }

    public void setCodigozip(Integer codigozip) {
        this.codigozip = codigozip;
    }
}
