/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *Clase modelo de la direccion 
 * @author Carlos Altán
 */
public class ModeloDireccion {
    
    
    private String direccion; 
    private int idDepartamento; 
    private int idMunicipio; 
    private int id; 
    private int idDireccion;
    public ModeloDireccion() {
    }
/**
 * Constructor de direccion
 * @param direccion direccion del doctor
 * @param idDepartamento id del departamento
 * @param idMunicipio id del municipio
 * @param id id direccion
 * @param idDireccion id 
 */
    

    public ModeloDireccion(String direccion, int idDepartamento, int idMunicipio, int id, int idDireccion) {
        this.direccion = direccion;
        this.idDepartamento = idDepartamento;
        this.idMunicipio = idMunicipio;
        this.id = id;
        this.idDireccion = idDireccion;
    }

    public ModeloDireccion(int idDireccion, String direccion) {
        this.idDireccion = idDireccion;
         this.direccion = direccion;
    }
    
/**
 * metodo que retorna el idDireccion
 * @return  idDireccion int 
 */
    public int getIdDireccion() {
        return idDireccion;
    }
/**
 * metodoq que recibe el idDireccion
 * @param idDireccion  int 
 */
    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }
    
    
/**
 * metodo que retorna el id
 * @return int id 
 */
    public int getId() {
        return id;
    }
/**
 * metodo que recibe el id 
 * @param id int id 
 */
    public void setId(int id) {
        this.id = id;
    }
    
/**
 * metodo que retorna la direccion
 * @return direccion del doctor
 */
    public String getDireccion() {
        return direccion;
    }
/**
 * metodo qu recibe la direccion
 * @param direccion direccion del doctor
 */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
/**
 * metodo que rotorna el id departamento
 * @return id departamento
 */
    public int getIdDepartamento() {
        return idDepartamento;
    }
/**
 * metodo que recibe el id departamento
 * @param idDepartamento id departamento
 */
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
/**
 * metodo que retorna el id municipio
 * @return id municipio
 */
    public int getIdMunicipio() {
        return idMunicipio;
    }
/**
 * metodo que recibe el id municipio
 * @param idMunicipio id municipio 
 */
    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
    public String toString(){
        return  idDireccion +"-"+ direccion; 
    }
}
