/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private  String rutCliente;
    private String nombreCliente, drieccionCliente;
    private int numeroContacto;
    private boolean tipoCliente;

    public Cliente() {
    }

 

    public Cliente(String rutCliente, String nombreCliente, String drieccionCliente, int numeroContacto, boolean tipoCliente) {
        this.rutCliente = rutCliente;
        this.nombreCliente = nombreCliente;
        this.drieccionCliente = drieccionCliente;
        this.numeroContacto = numeroContacto;
        this.tipoCliente = tipoCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }


    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDrieccionCliente() {
        return drieccionCliente;
    }

    public void setDrieccionCliente(String drieccionCliente) {
        this.drieccionCliente = drieccionCliente;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public boolean isTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(boolean tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rutCliente=" + rutCliente + ", nombreCliente=" + nombreCliente + ", drieccionCliente=" + drieccionCliente + ", numeroContacto=" + numeroContacto + ", tipoCliente=" + tipoCliente + '}';
    }
    
    
    
}
