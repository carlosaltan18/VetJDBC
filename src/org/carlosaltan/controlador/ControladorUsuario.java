/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.controlador;

import java.awt.HeadlessException;
import java.sql.Connection;
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
import org.carlosaltan.modelo.ModeloUsuario;

/**
 *Clase controlador de Usuario
 * @author Carlos Altán
 */
public class ControladorUsuario {
       private static ArrayList<ModeloUsuario> usuarios; 
       private static ControladorUsuario instancia = null; 
       
       public ControladorUsuario (){
           usuarios = new ArrayList<ModeloUsuario>(); 
            
       }
       public static ControladorUsuario getInstancia(){
           if (instancia == null){
               instancia = new ControladorUsuario(); 
           }
           return instancia;
       }
       public int cantidadDeInicio(){
           return  usuarios.size(); 
       }
       public ArrayList<ModeloUsuario> listaDeInicio(){
           return usuarios; 
       }
    
    
    
       public boolean  iniciarSesion(ModeloUsuario usuario){
           ModeloUsuario usuarioDB = new ModeloUsuario(); 
           try {
               PreparedStatement sentencia  = Conexion.getInstancia().getConexion().prepareCall("call sp_login(?, ?);"); 
               sentencia.setString(1, usuario.getUsuario());
               sentencia.setString(2, usuario.getContrasena());
               ResultSet resultado = sentencia.executeQuery(); 
               if (resultado.next()) {
                   usuarioDB.setUsuario(resultado.getNString(1));
                   usuarioDB.setContrasena(resultado.getNString(2));
                   if (usuario.getUsuario().equals(usuarioDB.getUsuario()) && String.valueOf(usuarioDB.getContrasena()).equals(usuario.getContrasena())) {
                       JOptionPane.showMessageDialog(null, "Bienvenido");
                       return  true; 
                   }
                   
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           return  false; 
       }
    /**
     * metodo para innsertar usuario 
     * @param usuario recive el usuarios 
     */
    public void insertarUser (ModeloUsuario usuario ){
        
       
         try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_agregarUsuario(?,?,?);");                           
                sentencia.setString(1,usuario.getUsuario());               
                sentencia.setString(2, usuario.getContrasena());
                sentencia.setBoolean(3, usuario.getEstado());
                
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "ENVIADO :)");
                
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
    }
    
}
