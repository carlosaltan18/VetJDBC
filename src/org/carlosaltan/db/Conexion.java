/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Clase donde se hace la conexion a la base de datos 
 * @author Carlos Altán
 */
public class Conexion {
      private Connection conexion;
    private static Conexion instancia; 
    
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// para versiones mayares a msql 7 se agrega el cj}
            conexion = DriverManager.getConnection( "jdbc:mysql://localhost:3306/db_veterinaria?useSSL = false","root", "admin");  
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
           
        }
    }
    /**
     * metoto para obtener la instancia de conexion
     * @return instancia
     */
    public synchronized static Conexion getInstancia(){
        
        if (instancia == null)
            instancia = new Conexion();
        return instancia; 
    }
    /**
     * metodo para obtener la conexion
     * @return conexion
     */
    public Connection getConexion() {
        return conexion;
    }
    /**
     * metodo para recibir la conexion
     * @param conexion conexion 
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
}
