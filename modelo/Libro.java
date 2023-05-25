package modelo;


public class Libro 
{
    //atributos 
    protected String autor;
    protected String nombre;
    protected int anioEdicion;
    protected Boolean libroLujo;
     
    //metodos 
    public Libro( String autor, String nombre,int anioEdicion)
    {
        this.anioEdicion=anioEdicion;
        this.autor=autor;
        this.nombre=nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }
    public Boolean getLibroLujo() {
        return libroLujo;
    }

   
    @Override
    public String toString() {
        return "Libro \nautor=" + getAutor() + "\nnombre=" + getNombre() + "\nanioEdicion=" + getAnioEdicion() + "\nlibroLujo="+ getLibroLujo() ;
    }

    public Libro() {
    }

    

    

    
    



    
}
