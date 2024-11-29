/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadegestiondealquilerventadevehiculos;

import Bd.Conexion;
import controller.ClienteController;
import views.MenuVehiculo;
import java.sql.ResultSet;

/**
 *
 * @author Cetecom
 */
public class SistemaDeGestionDeAlquilerVentaDeVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion cx = new Conexion ();
        cx.conectar();
        
        MenuVehiculo m = new MenuVehiculo();
        m.setVisible(true);
        
        
        
    }
    
}
