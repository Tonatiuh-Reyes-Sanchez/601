
package com.mycompany.exepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ex11 {

    public static void main(String[] args) {
        try {
         
            FileInputStream inputStream = new FileInputStream("archivo.txt");
    
        } catch (FileNotFoundException e) {
           
            System.out.println("Se produjo una excepción");
            System.out.println("No se pudo encontrar el archivo especificado.");
    
        }
    }
}

    

