package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

   public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreEmpresa;
        String direccionEmpresa;
        
        double[] misNotas;
        double promedio;
        double mejorNota;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        nombreEmpresa = DatoTrabajo.nombreEmpresa();
        direccionEmpresa = DatoTrabajo.direccionEmpresa();
        mejorNota = DatoFinal.obtenerMejorNota(misNotas);
        
        
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Empresa: %s\n"
                + "Direccion: %s\n"
                + "Promedio: %.2f\n"
                + "Nota mas alta: %.2f\n",
                nombre,
                apellidoRetornado,
                ciudad,
                nombreEmpresa,
                direccionEmpresa,
                promedio,
                mejorNota);
    }
    
}