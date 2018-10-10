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
    static String ruta="C:\\notas\\notas.csv";
    static String separador=",";

    static void grabarAlumno(Alumno elmalodelaclase) {
        try {
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
            
            fr = new FileReader(ruta);
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            while(linea!=null)
            {
                String[] campos=linea.split(separador);
                String nombre=campos[0];
                String nota=campos[1];
                int nota_numerica=Integer.parseInt(nota);
                Alumno a=new Alumno(nombre, nota_numerica);
                lista_alumnos.add(a);
                linea=br.readLine();
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
