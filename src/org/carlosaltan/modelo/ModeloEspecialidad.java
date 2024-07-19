/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *clase modelo de especialidad
 * @author Carlos Altán
 */
public class ModeloEspecialidad {
     private int idEspecialidad; 
    private String especialidad; 

    public ModeloEspecialidad() {
    }
/**
 * constructor de modeloEspecialidad
 * @param idEspecialidad  recibe el id de la especialidad int
 * @param especialidad recibe la especialidad string 
 */
    public ModeloEspecialidad(int idEspecialidad, String especialidad) {
        this.idEspecialidad = idEspecialidad;
        this.especialidad = especialidad;
    }
/**
 * metod que retorna el id especialidad
 * @return int 
 */
    public int getIdEspecialidad() {
        return idEspecialidad;
    }
/**
 * metodo que recibe el id especialidad
 * @param idEspecialidad id especialidad
 */
    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }
/**
 * metodo que retorna la especialidad
 * @return string 
 */
    public String getEspecialidad() {
        return especialidad;
    }
/**
 * metodo que recibe la especialidad
 * @param especialidad string 
 */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
     @Override
    public String toString(){
        return idEspecialidad + "_"+ especialidad; 
    }
}
