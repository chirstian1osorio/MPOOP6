package PR6;

/**
 *
 * @author alfre
 */
public class gerente extends empleado {
    private int presupuesto;

    public gerente() {
    }
    /**
     * 
     * @param nombre
     * @param numEmpleado
     * @param sueldo
     * @param presupuesto 
     */
    public gerente(String nombre, int numEmpleado, int sueldo,int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto =presupuesto;
    }
    /**
     * 
     * @return presupuesto
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * 
     * @param presupuesto 
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @param porcentaje 
     */
    public void aumnetarPresupuesto(int porcentaje){
        presupuesto +=(int)(presupuesto*porcentaje/100);
    }
    /**
     * 
     * @return tostring
     */
    @Override
    public String toString() {
        return super.toString()+"gerente{" +
                "presupuesto=" + presupuesto + '}';
    }
    
    
}
