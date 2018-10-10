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
    private int asignatura;//1-Mates; 2-Lengua

    public Alumno(String nombre, int nota, int asignatura) {
        this.nombre = nombre;
        this.nota = nota;
        this.asignatura = asignatura;
    }

    public int getAsignatura() {
        return asignatura;
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
        String texto="ASIGNATURA:\n"+obtenerNombreAsignaturaPorNumero(asignatura)+"\nNOMBRE: \n"+nombre+"\n NOTA:\n"+obtenerPalabraPorNota(nota);
        texto+="\n**************************************";
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

    private String obtenerNombreAsignaturaPorNumero(int asignatura) {
       if (asignatura==1)
       {return "MATEMÁTICAS";}
       return "LENGUA";
    }
    
    
}
