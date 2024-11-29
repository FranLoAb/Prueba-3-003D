/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author Cetecom
 */
public class Transaccion {
    private int idTransaccion;
    private Date fechaTransaccion;
    private boolean tipoTransaccion;
    private double montoTotal;

    public Transaccion() {
    }

    public Transaccion(int idTransaccion, Date fechaTransaccion, boolean tipoTransaccion, double montoTotal) {
        this.idTransaccion = idTransaccion;
        this.fechaTransaccion = fechaTransaccion;
        this.tipoTransaccion = tipoTransaccion;
        this.montoTotal = montoTotal;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public boolean isTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(boolean tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "idTransaccion=" + idTransaccion + ", fechaTransaccion=" + fechaTransaccion + ", tipoTransaccion=" + tipoTransaccion + ", montoTotal=" + montoTotal + '}';
    }

    
}
