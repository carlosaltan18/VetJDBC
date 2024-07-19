/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.modelo;

/**
 *Clase modelo de Doctor 
 * @author Carlos Altán
 */
public class DoctorModelo {
    
   
    private String nombreDoctor; 
    private String apellidoDoctor; 
    private String telefonoDoctor ; 
    private String colegiadoDoctor;
    private String emailDoctor;
    private int idDireccion; 
    private int idEspecialidad; 
    private String especialidad; 
    private boolean estadoDoctor; 
    private int id;
    private  String direccion; 
    
    public DoctorModelo() {}
    public DoctorModelo(int idEspecialidad, String especialidad){
        this.idEspecialidad  = idEspecialidad; 
        this.especialidad = especialidad; 
    }
/** 
 * Constructor con los datos de doctorModelo
 * @param nombreDoctor nombre del doctor
 * @param apellidoDoctor apellido del doctor
 * @param telefonoDoctor telefono del doctor
 * @param colegiadoDoctor colegiado del doctor 
 * @param emailDoctor email del doctor 
 * @param idDireccion id direccion del doctor 
 * @param idEspecialidad id especialidad
 * @param estadoDoctor  estado boolean
 * @param id id doc
 * @param especialidad especialidad del doctor 
 * @param direccion direccion 
 */
    public DoctorModelo(String direccion, String especialidad, int id, String nombreDoctor, String apellidoDoctor, String telefonoDoctor, String colegiadoDoctor, String emailDoctor, int idDireccion, int idEspecialidad, boolean estadoDoctor) {
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor = apellidoDoctor;
        this.telefonoDoctor = telefonoDoctor;
        this.colegiadoDoctor = colegiadoDoctor;
        this.emailDoctor = emailDoctor;
        this.idDireccion = idDireccion;
        this.idEspecialidad = idEspecialidad;
        this.estadoDoctor = estadoDoctor;
        this.id = id; 
        this.especialidad = especialidad;
        this.direccion = direccion; 
    }
    
    



    public DoctorModelo(int id, String nombreDoctor, String colegiadoDoctor) {
       this.id = id; 
       this.nombreDoctor = nombreDoctor; 
       this.colegiadoDoctor = colegiadoDoctor; 
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
     public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   /**
    * metodo que devuelve el nombre del doctor 
    * @return retorna el nombre del doctor 
    */
    public String getNombreDoctor() {
        return nombreDoctor;
    }
    /**
     * metodo para recibir el nombre del doctor
     * @param nombreDoctor recibe el nombre del doctor 
     */
    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }
    /**
     * metodo que retorna el epllido del doctor
     * @return retorna el apellido del doctor
     */

    public String getApellidoDoctor() {
        return apellidoDoctor;
    }
    /**
     * metodo que recibe el apellido del doctor 
     * @param apellidoDoctor apellido del doctor 
     */

    public void setApellidoDoctor(String apellidoDoctor) {
        this.apellidoDoctor = apellidoDoctor;
    }
    /**
     * metodo que recibe el telefono del doc
     * @return recibe el telefono del doc 
     */
    public String getTelefonoDoctor() {
        return telefonoDoctor;
    }
    /**
     * metodo que recibve el telefono del doc
     * @param telefonoDoctor telefono del doc 
     */

    public void setTelefonoDoctor(String telefonoDoctor) {
        this.telefonoDoctor = telefonoDoctor;
    }
    /**
     * metodo que retorna el colegiado
     * @return retorna el colegiado
     */
    public String getColegiadoDoctor() {
        return colegiadoDoctor;
    }
    /**
     * metodo que recibe el colegiado
     * @param colegiadoDoctor colegiado del doctor 
     */
    public void setColegiadoDoctor(String colegiadoDoctor) {
        this.colegiadoDoctor = colegiadoDoctor;
    }
    /**
     * metodo que retorna el email del doctor 
     * @return retorna el email 
     */
    public String getEmailDoctor() {
        return emailDoctor;
    }
    /**
     * metodo que recibe el email del doc 
     * @param emailDoctor email del doc 
     */
    public void setEmailDoctor(String emailDoctor) {
        this.emailDoctor = emailDoctor;
    }
    /**
     * meotod que retorne el id de la direccion para la base de datos 
     * @return retorne el id dreccion
     */
    public int getIdDireccion() {
        return idDireccion;
    }
    /**
     * metodo que recibe el id direccion para la base de datos 
     * @param idDireccion id direccion para la bd
     */
    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }
    /**
     * metodo que obtiene el id de la especilidad
     * @return retorna el id especialidad
     */

    public int getIdEspecialidad() {
        return idEspecialidad;
    }
    /**
     * metodo que recibe el id de la especialidad para la bd
     * @param idEspecialidad id especialidad
     */
    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }
    /**
     * metodo que retorna el estado del doctor 
     * @return estado del doc tipo boolean
     */

    public boolean getEstadoDoctor() {
        return estadoDoctor;
    }
/**
 * recibe el estado del doc 
 * @param estadoDoctor estado de tipo boolean 
 */
    public void setEstadoDoctor(boolean estadoDoctor) {
        this.estadoDoctor = estadoDoctor;
    }
    
/**
 * metodo toString 
 * @return  id+nombreDoctor+colegiado 
 */
    @Override
    public String toString(){
        return  id+"-"+nombreDoctor+"-"+colegiadoDoctor; 
    }
    
    
}
