/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa
    public static String nombreEmpresa(){
        Scanner leer = new Scanner (System.in);
        
        String nombreEmpresa;
        
        System.out.println("Ingrese el nombre de la empresa en la que trabaja");
        nombreEmpresa = leer.nextLine();
        
        return nombreEmpresa;
    }
    // método que permita preguntar al usuario la dirección de la empresa
    public static String direccionEmpresa(){
        Scanner leer = new Scanner (System.in);
        
        String direccionEmpresa;
        
        System.out.println("Ingrese la direccion de la empresa");
        direccionEmpresa = leer.nextLine();
        
        return direccionEmpresa;
    }
    
}