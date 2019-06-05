
package ejemploarreglos;


public class Persona {
    
    private String nombre;
    private String apellido;
    private int calificacion;

    public Persona(String nombre, String apellido, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString(){
       return getNombre();
    } 
    
}