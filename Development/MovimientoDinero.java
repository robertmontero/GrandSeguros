package com.ejercicio.GrandSeguros;

public class MovimientoDinero {

    private Integer transaccionId;
    private Double monto;
    private String tipoMov;
    private String concepto;
    private String nombreEmpleado;

    public MovimientoDinero(Integer transaccionId, Double monto, String tipoMov, String concepto, String nombreEmpleado) {
        this.setTransaccionId(transaccionId);
        this.setMonto(monto);
        this.setTipoMov(tipoMov);
        this.setConcepto(concepto);
        this.setNombreEmpleado(nombreEmpleado);
    }


    public Integer getTransaccionId() {
        return transaccionId;
    }

    public void setTransaccionId(Integer transaccionId) {
        this.transaccionId = transaccionId;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
}