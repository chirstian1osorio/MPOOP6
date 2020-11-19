package PR6;

/**
 *
 * @author alfre
 */
public class subProfesor extends subTrabajador{
    private int horas;

    public subProfesor() {
        
    }
    /**
     * 
     * @param nombre
     * @param edad
     * @param escuela
     * @param color
     * @param extra
     * @param horas 
     */
    public subProfesor(String nombre, int edad, String 
            escuela, String color,double extra,int horas) {
        super(nombre, edad, escuela, color,extra);
        this.horas = horas;
    }
    /**
     * 
     * @return horas
     */
    public int getHoras() {
        return horas;
    }
    /**
     * 
     * @param horas 
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    /**
     * 
     * @param horas 
     */
    public void extra(int horas){
        int nu,p;
        nu=15;
        System.out.println("tu paga adicional por horas de trabajo");
        System.out.println("se calcula multiplicando las horas: "+horas+" por $15");
        p=nu*horas;
        System.out.println("pago adicional: $"+p);
        salario=salario+p;
        System.out.println("tu pago total considerando adicional y salario: $"+salario);
    }
    /**
     * 
     * @return to string
     */
    @Override
    public String toString() {
        return super.toString()+"subProfesor{" 
                + "horas: " + horas + '}';
    }
    
    
    
}
