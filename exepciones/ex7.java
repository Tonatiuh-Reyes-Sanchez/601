
package com.mycompany.exepciones;

public class ex7 {
   
    public static void main(String[] args) {
        try {
           
            int[] array = obtenerArray();
            int elemento = array[10]; 
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Se produjo una excepción de ArrayIndexOutOfBoundsException.");
            System.out.println("El índice de acceso al array está fuera de los límites válidos.");
    
          
        }
    }
    
    public static int[] obtenerArray() {
       
        return new int[5]; 
    }
}



    

