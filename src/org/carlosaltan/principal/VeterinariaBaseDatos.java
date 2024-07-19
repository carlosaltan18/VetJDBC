/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.carlosaltan.principal;

import org.carlosaltan.vista.InicioVeterinaria;
import org.carlosaltan.vista.Login;

/**
 *Clase principal 
 * @author Carlos Altán
 */
public class VeterinariaBaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Login log = new Login ();
       log.setVisible(true);
       log.setLocationRelativeTo(null);      
       */
       InicioVeterinaria vet = new InicioVeterinaria ();
        vet.setVisible(true); 
        vet.setLocationRelativeTo(null);
    }
      
    }      
