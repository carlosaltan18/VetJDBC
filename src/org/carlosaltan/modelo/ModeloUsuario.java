/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *Clase modelo de usuarios para base de datos
 * @author Carlos Altán
 */
public class ModeloUsuario {
    
    private int id; 
    private String usuario; 
    private String contrasena; 
    private boolean estado; // para ver si es doc o cliente
    public ModeloUsuario (){}

    public ModeloUsuario(int id, String usuario, String contrasena, boolean estado) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.estado = estado;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void getContrasena(String valueOf) {
        
    }
    
    
    
    
    
}
