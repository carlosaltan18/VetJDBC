/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *clase modelo de municipio 
 * @author Carlos Altán
 */
public class ModeloMuniDep {
    
    private int idMunicipio; 
    
    private String municipio; 
    /**
     * constructo de modeloMuniDep
     * @param idMunicipio id municipio int
     * @param municipio municipio string 
     */

    public ModeloMuniDep(int idMunicipio, String municipio) {
        this.idMunicipio = idMunicipio;
        this.municipio = municipio;
    }
    
   public ModeloMuniDep(){}

   
/**
 * metodo que retorna el id municipio
 * @return int 
 */
    public int getIdMunicipio() {
        return idMunicipio;
    }
/**
 * metodo que recibe el id municipio
 * @param idMunicipio int 
 */
    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

/**
 * metodo que retorna el municipio
 * @return String 
 */

    public String getMunicipio() {
        return municipio;
    }
/**
 * metodo que recibe el municipio
 * @param municipio String 
 */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String toString(){
        return  municipio; 
    }
   
     
    
}
