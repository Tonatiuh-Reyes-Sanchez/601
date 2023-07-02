
package com.mycompany.exepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex10 {
    
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("archivo.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
            }
        } catch (IOException e) {
            System.out.println("Se produjo una excepción");
            System.out.println("Ocurrió un error al leer el archivo.");

        } finally {
        
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el BufferedReader: " + e.getMessage());
                }
            }
        }
    }
}

    

