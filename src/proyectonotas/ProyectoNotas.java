/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonotas;

import java.util.ArrayList;

/**
 *
 * @author luis
 */
public class ProyectoNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] opciones={"1-Insertar alumno","2-Listar", "3-Salir" };
        int opcion=EntradaSalida.mostrarMenu(opciones);
        while (opcion!=3)
        {
            switch(opcion)
            {
                    case 1://Insertar alumno
                           Alumno a=EntradaSalida.pedirAlumno();
                           AccesoFichero.grabarAlumno(a);
                           break;
                    case 2://Listar alumno
                        ArrayList<Alumno> lista_alumnos=AccesoFichero.leerAlumnos();
                        EntradaSalida.mostrarAlumnos(lista_alumnos);
                        break;
            }
            opcion=EntradaSalida.mostrarMenu(opciones);
        }
    }
    
}
