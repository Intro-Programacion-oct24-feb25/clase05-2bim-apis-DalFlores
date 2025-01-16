/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.security.SecureRandom;


public class Operador {
    
    public static int obtenerNumero() {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(5);
        return valorAleatorio;
    }
    
    public static int obtenerSuma(int a, int b){
        return a + b;
    }
    
    public String obtenerMensaje(){
        return "Hola Mundo";
    }
    
    public static void presentarDatos(int a, int b, int c){
        System.out.printf("La suma de %d + %d es igual a: %d\n", 
                a,
                b,
                c);
    }
    
}