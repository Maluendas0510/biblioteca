package modelo;

import java.util.ArrayList;

public class LibroColeccion extends Libro
{
    private String nombreColeccion;
    private int numeroColeccion;
    ArrayList <Libro> 
    public LibroColeccion(String autor, String nombre, int anioEdicion,String nombreColeccion,int numeroColeccion) 
    {
        super(autor, nombre, anioEdicion);
        this.nombreColeccion=nombreColeccion;
        this.numeroColeccion=numeroColeccion;
    }



    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public int getNumeroColeccion() {
        return numeroColeccion;
    }

    public void setNumeroColeccion(int numeroColeccion) {
        this.numeroColeccion = numeroColeccion;
    }

    @Override
    public String toString() {
        return "LibroColeccion nombreColeccion=" + nombreColeccion + ", numeroColeccion=" + numeroColeccion ;
    }

    

    
    
    

    
    
}
