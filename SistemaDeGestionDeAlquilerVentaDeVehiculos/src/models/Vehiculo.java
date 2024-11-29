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
public class Vehiculo {
    private final int idVehiculo;
    private String marcaVehiculo, modelovehiculo, tipoVehiculo;
    private Date añoVehiculo;
    private double precioVehiculo;
    private String estadoVehiculo;

    public Vehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

  
    public Vehiculo(int idVehiculo, String marcaVehiculo, String modelovehiculo, String tipoVehiculo, Date añoVehiculo, double precioVehiculo, String estadoVehiculo) {
        this.idVehiculo = idVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.modelovehiculo = modelovehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.añoVehiculo = añoVehiculo;
        this.precioVehiculo = precioVehiculo;
        this.estadoVehiculo = estadoVehiculo;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

   

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModelovehiculo() {
        return modelovehiculo;
    }

    public void setModelovehiculo(String modelovehiculo) {
        this.modelovehiculo = modelovehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Date getAñoVehiculo() {
        return añoVehiculo;
    }

    public void setAñoVehiculo(Date añoVehiculo) {
        this.añoVehiculo = añoVehiculo;
    }

    public double getPrecioVehiculo() {
        return precioVehiculo;
    }

    public void setPrecioVehiculo(double precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", marcaVehiculo=" + marcaVehiculo + ", modelovehiculo=" + modelovehiculo + ", tipoVehiculo=" + tipoVehiculo + ", a\u00f1oVehiculo=" + añoVehiculo + ", precioVehiculo=" + precioVehiculo + ", estadoVehiculo=" + estadoVehiculo + '}';
    }

   
    
}
