/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonotas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class AccesoFichero {
    static String ruta_lengua="C:\\notas\\notas_lengua.csv";
    static String ruta_mates="C:\\notas\\notas_mates.csv";
    static String separador=",";

    static void grabarAlumno(Alumno elmalodelaclase) {
        try {
            String ruta="";
            if (elmalodelaclase.getAsignatura()==1)
            {
                ruta=ruta_mates;
            }
            else
            {
                ruta=ruta_lengua;
            }
            FileWriter fw=new FileWriter(ruta, true);
            
            String texto=elmalodelaclase.getNombre()+separador+
                    elmalodelaclase.getNota()+"\n";
            fw.write(texto);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static ArrayList<Alumno> leerAlumnos() {
        FileReader fr=null;
        ArrayList<Alumno> lista_alumnos=new ArrayList<>();
        try {
            String [] rutas={ ruta_mates, ruta_lengua};
           for (int i=0; i<rutas.length; i++)
           {
                fr = new FileReader(rutas[i]);
                BufferedReader br=new BufferedReader(fr);
                String linea=br.readLine();
                while(linea!=null)
                {
                    String[] campos=linea.split(separador);
                    String nombre=campos[0];
                    String nota=campos[1];
                    int nota_numerica=Integer.parseInt(nota);
                    int asignatura=0;
                    if (i==0){asignatura=1;}else{asignatura=2;}
                    Alumno a=new Alumno(nombre, nota_numerica,asignatura);//asignatura vale 1 para mates y 2 para lengua
                    lista_alumnos.add(a);
                    linea=br.readLine();
                }
           } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista_alumnos;
    }
    
}
