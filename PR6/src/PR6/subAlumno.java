package PR6;

/**
 *
 * @author alfre
 */
public class subAlumno extends persona{
    private int materias;

    public subAlumno() {
    }
    /**
     * 
     * @param nombre
     * @param edad
     * @param escuela
     * @param color
     * @param materias 
     */
    public subAlumno(String nombre,int edad,String escuela,
            String color,int materias) {
        super(nombre, edad, escuela, color);
        this.materias=materias;
    }
    /**
     * 
     * @return materias
     */
    public int getMaterias() {
        return materias;
    }
    /**
     * 
     * @param materias 
     */
    public void setMaterias(int materias) {
        this.materias = materias;
    }
    /**
     * 
     * @param newMaterias 
     */
    public void newMaterias(int newMaterias){
        materias=newMaterias;
    }
    /**
     * 
     * @return tostring
     */
    @Override
    public String toString() {
        return super.toString()+"subAlumno{" +
                "materias: " + materias + '}';
    }
    
}
