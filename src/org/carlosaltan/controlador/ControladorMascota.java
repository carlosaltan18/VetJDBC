/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.controlador;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.carlosaltan.db.Conexion;
import org.carlosaltan.modelo.ModeloMascota;


/**
 * Clase controlador de mascot a
 * @author Carlos Altán
 */
public class ControladorMascota { 
    /**
     * metodo para actualizar mascot a
     * @param mascota objeto mascota 
     */
       public void actualizarMascota (ModeloMascota mascota){
        try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarMascota(?, ?, ?);");     
               sentencia.setInt(1, mascota.getId());
                sentencia.setString(2, mascota.getNombreMascota()); 
                sentencia.setString(3, mascota.getRaza());
                JOptionPane.showMessageDialog(null, "Actualizado :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }

        }
      
}
