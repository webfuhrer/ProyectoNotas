/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonotas;

/**
 *
 * @author luis
 */
public class Alumno {
    private String nombre;
    private int nota;
    
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String texto="NOMBRE: "+nombre+" NOTA: "+nota;
        return texto; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
