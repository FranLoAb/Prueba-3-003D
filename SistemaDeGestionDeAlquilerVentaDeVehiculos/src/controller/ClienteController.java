/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bd.Conexion;
import java.awt.List;
import java.util.ArrayList;
import models.Cliente;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author Cetecom
 */
public class ClienteController {
    
    /**
     *
     * @return
     */
  
        
    public ClienteController(){
    Conexion cx = new Conexion ();
    cx.conectar();
    
  
    }
    Conexion cx;

    
  public List <Cliente> listarCliente() {
  List <Cliente> cliente = new ArrayList <>();
   String query = "SELECT * FROM CLIENTE";
    try{
        
    ResultSet rs = cx.EjecutarQuery(query);
    while (rs.next()){
        cliente.add(new Cliente)(
        rs.getString(rutCliente),
        rs.getString(nombreCliente),
        rs.getString(drieccionCliente),
        rs.getInt(numeroContacto),
        rs.getBoolean(tipoCliente));
    }
    
       
        }catch(Exception e){
            System.out.println("Error, Vehiculo no encontrado!"+ e.getMessage());
        }
        return null;
  
  
  }
 public void  AgregarCliente(String rutCliente, String nombreCliente, String drieccionCliente, int numeroContacto, boolean tipoCliente){
     String query = "INSERT INTO 'Cliente'(rutCliente, nombreCliente, drieccionCliente, numeroContacto, tipoCliente) Values (?,?,?,?,?)";
     try{
        PreparedStatement st = cx.getConnection().prepareStatement(query);
         st.setString(1,rutCliente);
         st.setString(2,nombreCliente);
         st.setString(3,drieccionCliente);
         st.setInt(4, numeroContacto);
         st.setBoolean(5, tipoCliente);
         st.executeUpdate();
     }catch (Exception e){
         System.out.println(("Error, cliente no encontrado ")+e.getMessage());
     }
 }
  
}

