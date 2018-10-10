/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonotas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class EntradaSalida {
    private static Scanner sc=new Scanner(System.in);
    public static int mostrarMenu(String[] opciones_menu)
    {
       for (int i=0; i<opciones_menu.length; i++)
       {
           System.out.println(opciones_menu[i]);
       }
       int opcion=sc.nextInt();
       sc.nextLine();
       return opcion;
    }

    static Alumno pedirAlumno() {
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Nota: ");
        int nota=sc.nextInt();
        sc.nextLine();
        Alumno a=new Alumno(nombre, nota);
        return a;
    }

    static void mostrarAlumnos(ArrayList<Alumno> lista_alumnos) {
        for (int i=0; i<lista_alumnos.size(); i++)
        {
            Alumno a=lista_alumnos.get(i);
            System.out.println("Alumno: "+a.toString());
        }
    }
    
}
