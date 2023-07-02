
package com.mycompany.exepciones;

public class ex6 {

    public static void main(String[] args) {
        try {
         
            Object objeto = obj();
            a miInstancia = (a) objeto; 
   
        } catch (ClassCastException e) {
         
            System.out.println("Se produjo una excepción de ClassCastException.");
            System.out.println("No se pudo realizar la conversión de tipos correctamente.");
    
          
        }
    }
    
    public static Object obj() {

        return new a();
    }
}

class a {
 
}




