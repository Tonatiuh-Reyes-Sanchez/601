
package com.mycompany.exepciones;

public class ex9 {
    public static void main(String[] args) {
        try {
            String texto = obtenerTexto();
            int longitud = texto.length(); 
   
        } catch (NullPointerException e) {
           
            System.out.println("Se produjo una excepción");
            System.out.println("Se intentó acceder a un objeto que es nulo.");
        }
    }
    
    public static String obtenerTexto() {
      
        return null; 
        
    }
}

    

