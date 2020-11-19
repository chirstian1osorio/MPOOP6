package PR6;

/**
 *
 * @author alfre
 */
public class persona {
    private String nombre;
    private int edad;
    private String escuela;
    private String color;

    public persona() {
    }
    /**
     * 
     * @param nombre
     * @param edad
     * @param escuela
     * @param color 
     */
    public persona(String nombre, int edad, String escuela, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.escuela = escuela;
        this.color = color;
    }
    /**
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return escuela
     */
    public String getEscuela() {
        return escuela;
    }
    /**
     * 
     * @param escuela 
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    /**
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * 
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * 
     * @return to string
     */
    @Override
    public String toString() {
        return "persona{" + "nombre: " + nombre + ", edad: " + edad +
                ", escuela: " + escuela + ", color: " + color + '}';
    }
    /**
     * 
     * @param newColor 
     */
    public void color(String newColor){
        color=newColor;
    }
    
    
}
