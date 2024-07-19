/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.controlador;

import com.mysql.cj.util.DnsSrv;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.carlosaltan.db.Conexion;

import org.carlosaltan.modelo.DoctorModelo;
import org.carlosaltan.modelo.ModeloDept;
import org.carlosaltan.modelo.ModeloDireccion;
import org.carlosaltan.modelo.ModeloEspecialidad;
import org.carlosaltan.modelo.ModeloMuniDep;


/**
 * Clase controlador de doctor 
 * @author Carlos Altán
 */
public class ControladorDoctor {
    /**
     * Metodo para Insertar doctor
     * @param doctor objeto doctor
     * @param direccion direccion
     * @param idMuni id municipio
     * @param idDepa id departamento 
     */
    
    public void insertarDoc (DoctorModelo doctor, String direccion, int idMuni, int idDepa){
         try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertarDoctor(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");                           
                sentencia.setString(1, doctor.getNombreDoctor()); 
                sentencia.setString(2, doctor.getApellidoDoctor());
                sentencia.setString(3, doctor.getTelefonoDoctor());
                sentencia.setString(4, doctor.getColegiadoDoctor());
                sentencia.setString (5, doctor.getEmailDoctor());
                sentencia.setInt (6, doctor.getIdEspecialidad());
                sentencia.setBoolean(7, true);
                sentencia.setString (8, direccion);
                sentencia.setInt (9, idDepa);
                sentencia.setInt (10, idMuni);
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "ENVIADO :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
    }
    /**
     * metodoo para insertar direccion
     * @param direccion direccion
     * @param idMuni id municipio
     * @param idDepa id departamento
     */
    public void insertarDirec (String direccion, int idMuni, int idDepa){
         try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_insertarDireccion(?, ?,?);");                           
                sentencia.setString (1, direccion);
                sentencia.setInt (2, idDepa);
                sentencia.setInt (3, idMuni);
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "ENVIADO :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
    }
        
   /**
    * metodo para actualizar doctor 
    * @param doctor objeto doctor 
    * @param direccion direccion
    * @param idMuni id municipio
    * @param idDepa id departamento
    */
    public void actualizarDoc (DoctorModelo doctor, String direccion, int idMuni, int idDepa){
         try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarDoc(?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?);");     
               sentencia.setInt(1, doctor.getId());
                sentencia.setString(2, doctor.getNombreDoctor()); 
                sentencia.setString(3, doctor.getApellidoDoctor());
                sentencia.setString(4, doctor.getTelefonoDoctor());
                sentencia.setString(5, doctor.getColegiadoDoctor());
                sentencia.setString (6, doctor.getEmailDoctor());
                sentencia.setInt (7, doctor.getIdDireccion());
                sentencia.setInt (8, doctor.getIdEspecialidad());
                sentencia.setBoolean(9, doctor.getEstadoDoctor() );
                sentencia.setString (10, direccion);
                sentencia.setInt (11, idDepa);
                sentencia.setInt (12, idMuni);
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "ACTUALIZADO :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
    }
    /**
     * metodo para eliminar doctor 
     * @param id id para eliminar do c
     * @param estado estaedo del doc
     */
    public void eliminarDoc(int id, boolean estado){
         try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarEstado(?, ?);");     
               sentencia.setInt(1, id);
                sentencia.setBoolean(2, estado); 
                
                JOptionPane.showMessageDialog(null, "Eliminado :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
        
    }
    /**
     * metodo para obtener la especialidad
     * @return  arraylist 
     */
    public ArrayList<ModeloEspecialidad> getEspecialidad(){
        Connection con = Conexion.getInstancia().getConexion(); 
        Statement stmt; 
        ResultSet rs; 
        
        ArrayList<ModeloEspecialidad> listaEspecialidad = new ArrayList<>(); 
        try {
            stmt = con.createStatement(); 
            rs = stmt.executeQuery("SELECT *from tbl_especialidad"); 
            while (rs.next()) {                
                ModeloEspecialidad doctor = new ModeloEspecialidad(); 
                doctor.setIdEspecialidad(rs.getInt("id_especialidad"));
                doctor.setEspecialidad(rs.getString("especialidad"));
                listaEspecialidad.add(doctor);
            }
        } catch (SQLException e) {
        }
        return listaEspecialidad; 
    }
    /**
     * metodo para obtener municipio 
     * @return arraylist
     */
     public ArrayList<ModeloMuniDep> getMunicipio(){
        Connection con = Conexion.getInstancia().getConexion(); 
        Statement stmt; 
        ResultSet rs; 
        
        ArrayList<ModeloMuniDep> listaMuni = new ArrayList<>(); 
        try {
            stmt = con.createStatement(); 
            rs = stmt.executeQuery("SELECT *from tbl_municipio"); 
            while (rs.next()) {                
                ModeloMuniDep muni = new ModeloMuniDep(); 
                muni.setIdMunicipio(rs.getInt("id_municipio"));
                muni.setMunicipio(rs.getString("municipio"));
                listaMuni.add(muni);
            }
        } catch (SQLException e) {
        }
        return listaMuni; 
    }
     /**
      * metodo para obtener la lista departamento 
      * @return retorna la lista departamento 
      */
      public ArrayList<ModeloDept> getDepartamento(){
        Connection con = Conexion.getInstancia().getConexion(); 
        Statement stmt; 
        ResultSet rs; 
        
        ArrayList<ModeloDept> listaDep = new ArrayList<>(); 
        try {
            stmt = con.createStatement(); 
            rs = stmt.executeQuery("SELECT *from tbl_departamento"); 
            while (rs.next()) {                
                ModeloDept dep = new ModeloDept(); 
                dep.setIdDepartamento(rs.getInt("id_departamento"));
                dep.setDepartamento(rs.getString("departamento"));
                listaDep.add(dep);
            }
        } catch (SQLException e) {
        }
        return listaDep; 
    }
      /**
       * metodo para obtener la direccion
       * @return  retorna la lista de direcciones 
       */
        public ArrayList<ModeloDireccion> getDireccion(){
        Connection con = Conexion.getInstancia().getConexion(); 
        Statement stmt; 
        ResultSet rs; 
        
        ArrayList<ModeloDireccion> listaDire = new ArrayList<>(); 
        try {
            stmt = con.createStatement(); 
            rs = stmt.executeQuery("SELECT *from tbl_direccion"); 
            while (rs.next()) {                
                ModeloDireccion dep = new ModeloDireccion(); 
                dep.setIdDireccion(rs.getInt("id_direccion"));
                dep.setDireccion(rs.getString("direccion"));
                listaDire.add(dep);
            }
        } catch (SQLException e) {
        }
        return listaDire; 
    }


        
    
    
}
