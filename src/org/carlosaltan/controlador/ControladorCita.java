/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.controlador;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.carlosaltan.db.Conexion;
import org.carlosaltan.modelo.DoctorModelo;

import org.carlosaltan.modelo.ModeloCita; 


/**
 *Clase controlador de cita
 * @author Carlos Altán
 */
public class ControladorCita {
    /**
     * Metodo para actualizar cita
     * @param cita recibe un objeto tipo ModeloCita
     */
    public void actualizarCita (ModeloCita cita){
        try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCita(?, ?, ?, ?);");     
               sentencia.setInt(1, cita.getId());
                sentencia.setString(1,cita.getFecha());
               sentencia.setString(3, cita.getHora()); 
               sentencia.setFloat(4, Float.parseFloat(cita.getCosto()));
                
                JOptionPane.showMessageDialog(null, "Actualizado :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
        
    

        }
    /**
     * Metodo para eliminarCliente
     * @param cita objeto ModeloCita
     */
     public void eliminarCli(ModeloCita cita){
        try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarCita(?, ?);");     
               sentencia.setInt(1, cita.getId());
                sentencia.setBoolean(2, cita.isEstadoCita()); 
                
                JOptionPane.showMessageDialog(null, "Eliminado :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }

        }
     /**
      * metodo para obtener los doctores 
      * @return retorna un arraylist 
      */
     public ArrayList<DoctorModelo> getDoc(){
        Connection con = Conexion.getInstancia().getConexion(); 
        Statement stmt; 
        ResultSet rs; 
        
        ArrayList<DoctorModelo> listaDire = new ArrayList<>(); 
        try {
            stmt = con.createStatement(); 
            rs = stmt.executeQuery("SELECT *from tbl_doctor"); 
            while (rs.next()) {                
                DoctorModelo dep = new DoctorModelo(); 
                dep.setId(rs.getInt("id_doctor"));
                dep.setNombreDoctor(rs.getString("nombre_doctor"));
                dep.setColegiadoDoctor(rs.getString("colegiado"));
                
                listaDire.add(dep);
            }
        } catch (SQLException e) {
        }
        return listaDire; 
    }

    
}
