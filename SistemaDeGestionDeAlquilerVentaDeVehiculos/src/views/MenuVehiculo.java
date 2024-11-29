/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import Bd.Conexion;
import models.Cliente;

/**
 *
 * @author Cetecom
 */
public class MenuVehiculo extends javax.swing.JFrame {
       


    /**
     */
    public MenuVehiculo() {
        initComponents();
        ListarCliente();
        
    Conexion cx = new Conexion ();
    cx.conectar();
    
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lblMenuVehiculo = new javax.swing.JLabel();
        mnBarraPrincipal = new javax.swing.JMenuBar();
        mnGestionarVehiculo = new javax.swing.JMenu();
        mniAgregar = new javax.swing.JMenuItem();
        mniEditar = new javax.swing.JMenuItem();
        mniEliminar = new javax.swing.JMenuItem();
        mniListar = new javax.swing.JMenuItem();
        mnSalir = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenuVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMenuVehiculo.setText("Menú Vehiculo");

        mnGestionarVehiculo.setText("Gestionar Vehiculos");

        mniAgregar.setText("Agregar");
        mniAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarActionPerformed(evt);
            }
        });
        mnGestionarVehiculo.add(mniAgregar);

        mniEditar.setText("Editar");
        mnGestionarVehiculo.add(mniEditar);

        mniEliminar.setText("Eliminar");
        mnGestionarVehiculo.add(mniEliminar);

        mniListar.setText("Listar");
        mniListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarActionPerformed(evt);
            }
        });
        mnGestionarVehiculo.add(mniListar);

        mnBarraPrincipal.add(mnGestionarVehiculo);

        mnSalir.setText("Salir");

        mniSalir.setText("Salir");
        mnSalir.add(mniSalir);

        mnBarraPrincipal.add(mnSalir);

        setJMenuBar(mnBarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(lblMenuVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lblMenuVehiculo)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void listarCliente(){
    initComponents();
    ListarCliente();
}
    private void mniListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarActionPerformed
      Cliente C = new Cliente();
      C.setDrieccionCliente("");
      this.setVisible(rootPaneCheckingEnabled);
        
        
    }//GEN-LAST:event_mniListarActionPerformed

    private void mniAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarActionPerformed
    
     
     // TODO add your handling code here:
    }//GEN-LAST:event_mniAgregarActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblMenuVehiculo;
    private javax.swing.JMenuBar mnBarraPrincipal;
    private javax.swing.JMenu mnGestionarVehiculo;
    private javax.swing.JMenu mnSalir;
    private javax.swing.JMenuItem mniAgregar;
    private javax.swing.JMenuItem mniEditar;
    private javax.swing.JMenuItem mniEliminar;
    private javax.swing.JMenuItem mniListar;
    private javax.swing.JMenuItem mniSalir;
    // End of variables declaration//GEN-END:variables

    private void ListarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
