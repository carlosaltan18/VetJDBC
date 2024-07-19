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
import org.carlosaltan.modelo.ClienteModelo;
import org.carlosaltan.modelo.ModeloCita;
import org.carlosaltan.modelo.ModeloDireccion;
import org.carlosaltan.modelo.ModeloMascota;
import org.carlosaltan.modelo.ModeloServicio;

/**
 *Clase controlador de Cliente
 * @author Carlos Altán
 */
public class ControladorCliente {
    /**
     * Metodo para insertar cliente, cita, mascota y detalles 
     * @param cliente objeto cliente
     * @param cita objeto cita
     * @param mascota objeto masctoa
     * @param id_doc idoc
     * @param id_servicio id servicio 
     */
    
     public void insertarClie (ClienteModelo cliente, ModeloCita cita, ModeloMascota mascota, int id_doc, int id_servicio ){
         try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarCita_Cli(?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");                           
                sentencia.setString(1,cita.getFecha());               
                sentencia.setString(2, cita.getHora());
                sentencia.setFloat(3, Float.parseFloat(cita.getCosto()));
                sentencia.setBoolean(4, true);
                sentencia.setString (5, mascota.getNombreMascota());
                sentencia.setString (6, mascota.getRaza());
                sentencia.setString(7, cliente.getNombreCliente());
                sentencia.setString(8, cliente.getApellidoCliente());
                sentencia.setString (9, cliente.getTelefonoCliente());
                sentencia.setString(10, cliente.getEmailCliente());
                sentencia.setString(11, cliente.getDpiCliente());
                sentencia.setBoolean(12, true);
                sentencia.setInt (13, id_doc); 
                sentencia.setInt(14, id_servicio);
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "ENVIADO :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
    }
    /**
     * metodo para actualizar cliente
     * @param cliente objeto cliente
     */
     public void actualizarCcli(ClienteModelo cliente ){
         try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCliente(?, ?, ?, ?, ?, ?, ?);");     
               sentencia.setInt(1, cliente.getId());
               sentencia.setString(2, cliente.getNombreCliente());
                sentencia.setString(3, cliente.getApellidoCliente());
                sentencia.setString (4, cliente.getTelefonoCliente());
                sentencia.setString(5, cliente.getEmailCliente());
                sentencia.setString(6, cliente.getDpiCliente());
                sentencia.setBoolean(7, cliente.getEstadoCliente()); 
                
                JOptionPane.showMessageDialog(null, "ACTUALIZADO :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
        
    }
         /**
          * metodo para eliminarCli
          * @param cliente objeto cliente
          */
    public void eliminarCli(ClienteModelo cliente){
        try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarCliente(?, ?);");     
               sentencia.setInt(1, cliente.getId());
                sentencia.setBoolean(2, cliente.getEstadoCliente()); 
                
                JOptionPane.showMessageDialog(null, "Eliminado :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
        }
    
    /**
     * metodo para obtener la lista de servicio
     * @return lista de servicios arrylist 
     */
         public ArrayList<ModeloServicio> getServicio(){
        Connection con = Conexion.getInstancia().getConexion(); 
        Statement stmt; 
        ResultSet rs; 
        
        ArrayList<ModeloServicio> listaDire = new ArrayList<>(); 
        try {
            stmt = con.createStatement(); 
            rs = stmt.executeQuery("SELECT *from tbl_servicio"); 
            while (rs.next()) {                
                ModeloServicio dep = new ModeloServicio(); 
                dep.setIdServicio(rs.getInt("id_servicio"));
                dep.setServicio(rs.getString("servicio"));
                dep.setPrecio(rs.getFloat("costo_servicio"));
                
                listaDire.add(dep);
            }
        } catch (SQLException e) {
        }
        return listaDire; 
    }
    
}
