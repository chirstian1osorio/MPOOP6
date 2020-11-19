package PR6;

/**
 *
 * @author alfre
 */
public class empleado {
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    public empleado() {
    }
    /**
     * 
     * @param nombre
     * @param numEmpleado
     * @param sueldo 
     */
    public empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
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
     * @return empleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * 
     * @param numEmpleado 
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * 
     * @return sueldo
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * 
     * @param sueldo 
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * 
     * @return to string 
     */
    @Override
    public String toString() {
        return "empleado{" + "nombre=" + nombre +
                ", numEmpleado=" + numEmpleado +
                ", sueldo=" + sueldo + '}';
    }
    /**
     * 
     * @param porcentaje 
     */
    public void aumnetarSueldo(int porcentaje){
        sueldo +=(int)(sueldo*porcentaje/100);
        
    }
}
