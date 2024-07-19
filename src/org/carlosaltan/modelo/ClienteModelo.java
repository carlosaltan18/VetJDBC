/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *Clase modelo de Cliente 
 * @author Carlos Altán
 */
public class ClienteModelo {
    
    private String nombreCliente; 
    private String fecha; 
    private String apellidoCliente;
    private String telefonoCliente; 
    private String emailCliente; 
    private String dpiCliente; 
    private boolean estadoCliente;
    private int id; 
    
    public ClienteModelo (){}
   /**
    * Constructor de Cliente
    * @param nombreCliente nombre del cliente String 
    * @param apellidoCliente apellido del Cliente String 
    * @param telefonoCliente telefono del cliente String 
    * @param emailCliente email del Cliente sting 
    * @param dpiCliente dpi del cliente String 
    * @param estadoCliente  estado del cliente boolean
    * @param id id cliente
    * @param fecha fecha para cita 
    */

    public ClienteModelo(String fecha, int id, String nombreCliente, String apellidoCliente, String telefonoCliente, String emailCliente, String dpiCliente, boolean estadoCliente) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
        this.dpiCliente = dpiCliente;
        this.estadoCliente = estadoCliente;
        this.id = id;
        this.fecha = fecha; 
    }
    /**
     * metodo get de fecha 
     * @return String 
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * metodo set de fecha 
     * @param fecha String 
     */

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * metodo get id
     * @return int id 
     */

    public int getId() {
        return id;
    }
    /**
     * metodo set id 
     * @param id int 
     */

    public void setId(int id) {
        this.id = id;
    }
    
/**
 * Metodo que retorna el nombre del cliente
 * @return retorna el nombre del cliente
 */
    public String getNombreCliente() {
        return nombreCliente;
    }
/**
 * metodo que recibe el nombre del cliente
 * @param nombreCliente nombre del cliente
 */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
/**
 * metodo que retorna el apellido del cliente
 * @return retorna el apellido del cliente
 */
    public String getApellidoCliente() {
        return apellidoCliente;
    }
/**
 * metodo que recibe el apellido del cliente
 * @param apellidoCliente apellido del cliente String 
 */
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
/**
 * metodo que retorna el telefono del cliente
 * @return retorna el telefono del cliente
 */
    public String getTelefonoCliente() {
        return telefonoCliente;
    }
/**
 * metodo que recibe el telefono del cliente
 * @param telefonoCliente recibe el telefono del cliente
 */
    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
/**
 * metodoq que retorna el email del cliente
 * @return retorna el email
 */
    public String getEmailCliente() {
        return emailCliente;
    }
/**
 * metodo que recibe el email
 * @param emailCliente email del cliente
 */
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
/**
 * metodo que retorna el dpi del cliente
 * @return dpi del cliente
 */
    public String getDpiCliente() {
        return dpiCliente;
    }
/**
 * metodo que recibe el dpi del cliente
 * @param dpiCliente dpi del cliente
 */
    public void setDpiCliente(String dpiCliente) {
        this.dpiCliente = dpiCliente;
    }
/**
 * metodo que retorna el estado del cliente
 * @return estado del cliente
 */
    public boolean getEstadoCliente() {
        return estadoCliente;
    }
/**
 * metdo que recibe el estado del cliente
 * @param estadoCliente estado del cliente 
 */
    public void setEstadoCliente(boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
    
        
    
    
}
