/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *Clase modelo de departamento 
 * @author Carlos Altán
 */
public class ModeloDept {
    private int idDepartamento; 
    private String departamento;
    
    public ModeloDept(){}

  
/**
 * constructor de modelodept 
 * @param idDepartamento int 
 * @param departamento  string 
 */
    public ModeloDept(int idDepartamento, String departamento) {
        this.idDepartamento = idDepartamento;
        this.departamento = departamento;
     
    }
/**
 * metodo que retorna el id departamento 
 * @return id departamento 
 */
    public int getIdDepartamento() {
        return idDepartamento;
    }
/**
 * metodo para recibir el id departamento 
 * @param idDepartamento int
 */
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
/**
 * metodo que retorna el departamento 
 * @return departamento string 
 */
    public String getDepartamento() {
        return departamento;
    }
/**
 * Metodo que recibe el departamento
 * @param departamento string departamento 
 */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    /**
     * metodo toString 
     * @return departamento 
     */
     public String toString(){
        return departamento; 
    }
}
