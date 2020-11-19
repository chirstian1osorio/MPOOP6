package PR6;

/**
 *
 * @author alfre
 */
public class subDirector extends subTrabajador{
    private int horas;

    public subDirector() {
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
    public subDirector(String nombre, int edad, String 
            escuela, String color,double extra,int horas) {
        super(nombre, edad, escuela, color,extra);
        this.horas=horas;
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
    public void trabajo(int horas){
        int nuevo,m;
        nuevo=30;
        System.out.println("tu paga adicional por horas de trabajo");
        System.out.println("se calcula multiplicando las horas: "+horas+" por $30");
        m=nuevo*horas;
        System.out.println("pago adicional: $"+m);
        salario=salario+m;
        System.out.println("tu pago total considerando adicional y salario: $"+salario);
    }
    /**
     * 
     * @return tostring
     */
    @Override
    public String toString() {
        return super.toString()+"subDirector{" +
                "horas: " + horas + '}';
    }
    
}
