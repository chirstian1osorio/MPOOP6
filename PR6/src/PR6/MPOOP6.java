package PR6;

/**
 *
 * @author alfre
 */
public class MPOOP6 {
    public static void main(String[] args) {
        System.out.println("1*********");
        empleado empleado= new empleado("Jorge Montaño",123,15000);
        System.out.println(empleado);
        empleado.aumnetarSueldo(15);
        System.out.println(empleado);
        
        gerente gerente1=new gerente();
        gerente1.setNombre("Alan Morales");
        gerente1.setNumEmpleado(124);
        gerente1.setSueldo(20000);
        gerente1.setPresupuesto(100000);
        System.out.println(gerente1);
        
        System.out.println("2*******************");
        //asignatura de metodos
        gerente1.aumnetarSueldo(10);
        gerente1.aumnetarPresupuesto(5);
        System.out.println(gerente1);
        
        System.out.println("3*******************");
        gerente gerente2=new gerente("Miguel Hurtado",125,21000,300000);
        System.out.println(gerente2);
        gerente2.aumnetarPresupuesto(25);
        System.out.println(gerente2);
        
        System.out.println("\n\tPRACTICA- persona");
        persona persona=new persona("Julian Perez",12,"Fac de quimica","azul");
        System.out.println(persona);
        persona.color("Morado");
        System.out.println(persona);
        
        System.out.println("\n\tPRACTICA- subAlumno");
        subAlumno alumno=new subAlumno("Luis Omar",14,"Primario ruiz","verde",5);
        System.out.println(alumno);
        alumno.color("amarillo");
        alumno.newMaterias(7);
        System.out.println(alumno);
        
        System.out.println("\n\tPRACTICA- subTrabajador");
        subTrabajador trabajador= new subTrabajador("Hector Amezcua",
                27,"Fac ingenieria","rojo",123.5);
        System.out.println(trabajador);
        trabajador.color("cafe");
        trabajador.aumento(125);
        System.out.println(trabajador);
        
        System.out.println("\n\tPRACTICA- subDirector");
        subDirector director=new subDirector("Alondra Morales",
                36,"Fac Medicina","azul",118.45,3);
        System.out.println(director);
        director.trabajo(3);
        director.color("gris");
        director.aumento(136.23);
        System.out.println("hiciste mas horas de trabajo");
        director.trabajo(5);
        System.out.println(director);
        
        System.out.println("\n\tPRACTICA- subProfesor");
        subProfesor profesor=new subProfesor("Enrique Tapia",
                45,"Secundaria Tec30","rosa",98.23,2);
        System.out.println(profesor);
        profesor.extra(2);
        profesor.color("naranja");
        profesor.aumento(101.78);
        System.out.println("hiciste mas horas de trabajo");
        profesor.extra(8);
        System.out.println(profesor);
        
    }
}
