
package com.mycompany.exepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ex8 {
 
    public static void main(String[] args) {
        try {
           
            cargarClase("conexion exitosa"); 
   
        } catch (ClassNotFoundException e) {
            
            System.out.println("Se produjo una excepción");
            System.out.println("No se pudo encontrar la clase especificada.");
        }
    }
    
    public static void cargarClase(String nombreClase) throws ClassNotFoundException {
        try {
           
            Class.forName(nombreClase);
        } catch (ClassNotFoundException e) {
            
            throw e;
        }
    }
}

   
