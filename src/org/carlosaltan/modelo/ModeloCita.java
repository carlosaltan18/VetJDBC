/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *Clase modelo de cita 
 * @author Carlos Altán
 */
public class ModeloCita {
    
    private String hora; 
    private String costo; 
    private String fecha; 
    private int idMascota; 
    private int idCliente; 
    private int id;
   private boolean estadoCita; 
/**
 * Constructor de ModeloCita 
 * @param hora hora string 
 * @param costo costo float
 * @param fecha fecha string 
 * @param idMascota idMascota int 
 * @param idCliente idCliente int 
 * @param id id int 
 * @param estadoCita estadoc tia boolean 
 */
    public ModeloCita(String hora, String costo, String fecha, int idMascota, int idCliente, int id, boolean estadoCita) {
        this.hora = hora;
        this.costo = costo;
        this.fecha = fecha;
        this.idMascota = idMascota;
        this.idCliente = idCliente;
        this.id = id;
        this.estadoCita = estadoCita;
    }
    

    public ModeloCita() {
    }
/**
 * metodo que retorna el id 
 * @return id 
 */
    public int getId() {
        return id;
    }
/**
 * metodo que recibe el id 
 * @param id el id 
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * metodo que retorna la hora
 * @return retorna la hora
 */

    public String getHora() {
        return hora;
    }
/**
 * metodo que reecibe la hora 
 * @param hora recibe la hora
 */
    public void setHora(String hora) {
        this.hora = hora;
    }
/**
 * metodo que retorna el costo 
 * @return retorna el costo
 */
    public String getCosto() {
        return costo;
    }
/**
 * metodoq que recibe el costo
 * @param costo recibe el costo 
 */
    public void setCosto(String costo) {
        this.costo = costo;
    }
/**
 * metodo que retorna la fecha 
 * @return  retorna la fecha 
 */
    public String getFecha() {
        return fecha;
    }
/**
 * metodo que recibe la fecha 
 * @param fecha recibe la fecha string 
 */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(boolean estadoCita) {
        this.estadoCita = estadoCita;
    }

    public void getHora(String text) {
        
    }
    
}
