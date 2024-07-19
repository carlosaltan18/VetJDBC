/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 * Clase modelo de mascota
 * @author Carlos Altán
 */
public class ModeloMascota {
    
    
    private String nombreMascota; 
    private String raza; 
    private int id; 
    public ModeloMascota(){}
    /**
 * Constructor de Clase Mascota
 * @param nombreMascota nombre de la mascota
 * @param raza raza de la mascota
 * @param id int de id 
 */
    public ModeloMascota(String nombreMascota, String raza, int id) {
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.id = id; 
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
 * metodo que retorna el nombre de la mascot a
 * @return nombre de la mascota
 */
    public String getNombreMascota() {
        return nombreMascota;
    }
/**
 * Metodo que recibe el nombre de la mascota 
 * @param nombreMascota nombre de las mascota
 */
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
/**
 * metodo que retorna la raza de las mascota
 * @return raza de mascota
 */
    public String getRaza() {
        return raza;
    }
/**
 * metodo que recive la raza
 * @param raza raza de la mascota
 */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    
    
    
}
