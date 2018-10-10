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
        String texto="NOMBRE: "+nombre+" NOTA: "+obtenerPalabraPorNota(nota);
        
        return texto; //To change body of generated methods, choose Tools | Templates.
    }

    private String obtenerPalabraPorNota(int nota) {
        if (nota<=2)
        {
            return "MUY DEFICIENTE";
        }
        else if (nota>2 && nota<5)
        {
            return "INSUFICIENTE";
        }
        else if(nota==5)
        {
                    return "SUFICIENTE";
        }
        else if (nota>5 && nota<8)
        {
            return "BIEN";
        }
        else if(nota==8)
        {
            return "NOTABLE";
        }
        return "SOBRESALIENTE";
            
    }
    
    
}
