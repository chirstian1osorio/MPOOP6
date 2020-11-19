package PR6;

/**
 *
 * @author alfre
 */
public class subTrabajador extends persona{
   double salario;
   double extra;

    public subTrabajador() {

    }
    /**
     * 
     * @param nombre
     * @param edad
     * @param escuela
     * @param color
     * @param extra 
     */
    public subTrabajador(String nombre, int edad,
            String escuela, String color,double extra) {
        super(nombre, edad, escuela, color);
        this.salario=1200;
        this.extra=extra;
    }
    /**
     * 
     * @return extra
     */
    public double getExtra() {
        return extra;
    }
    /**
     * 
     * @param extra 
     */
    public void setExtra(double extra) {
        this.extra = extra;
    }
    
    /**
     * 
     * @param dextra 
     */
    public void aumento(double dextra){
        double un;
        un=salario;
        System.out.println("pago del seguro: $"+dextra);
        System.out.println("salario anterior: $"+un);
        salario=salario+dextra;
        System.out.println("salario ahora con pago del seguro: $"+salario);
    }
    /**
     * 
     * @return tostring
     */
    @Override
    public String toString() {
        return super.toString()+"subTrabajador{" +
                "salario: " + salario + ", seguro: " + extra + '}';
    }
    
    
}
