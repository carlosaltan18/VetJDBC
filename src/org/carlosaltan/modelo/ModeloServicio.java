/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *clase modelo de servicio 
 * @author Carlos Altán
 */
public class ModeloServicio {
    private int idServicio; 
    private float precio; 
    private String servicio; 
/**
 * constructo de modeloServicio 
 * @param idServicio id servicio int
 * @param servicio servicio String 
 * @param precio precio float 
 */
    public ModeloServicio(int idServicio, String servicio, float precio) {
        this.idServicio = idServicio;
        this.precio = precio;
        this.servicio = servicio;
    }

    public ModeloServicio() {
    }
/***
 * metodo que retorna el id servicio 
 * @return int
 */
    public int getIdServicio() {
        return idServicio;
    }
/**
 * metodo que recibe el idServicio 
 * @param idServicio int 
 */
    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }
/**
 * metodo que retorna el precio 
 * @return float 
 */
    public float getPrecio() {
        return precio;
    }
/**
 * metodo que recibe el precio 
 * @param precio float 
 */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
/**
 * metodo que retorna el servicio
 * @return String 
 */
    public String getServicio() {
        return servicio;
    }
/**
 * metodoq qur recibe el servicio 
 * @param servicio String 
 */
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
/**
 * metodo to String 
 * @return  serviico + precio 
 */    
    
    public String toString (){
        return servicio+"-"+precio; 
    }
    
}
