package s01n01ex2;

public class MainTrabajador2 {
    //anotación elimina los warnings para que el programa compile sin advertencias
    @SuppressWarnings("deprecation")

    public static void main(String[] args) {

        Trabajador2Presencial trabajadorPresencial = new Trabajador2Presencial("Juan","Cruz",25);
        Trabajador2Online trabajadorOnline = new Trabajador2Online("Ana","García",35);

        double horasTrabajadasPresencial = 40.0;
        double horasTrajadasOnline = 30;

        double sueldoPresencial = trabajadorPresencial.calcularSueldo(horasTrabajadasPresencial);
        double sueldoOnline = trabajadorOnline.calcularSueldo(horasTrajadasOnline);

        System.out.println("El sueldo del trabajador presencial es: " + sueldoPresencial);
        System.out.println("El sueldo del trabajador online es: " + sueldoOnline);

        //llamando a los métodos obsolestos y suprimiendo los warnings
        trabajadorPresencial.metodoObsoleto();
        trabajadorOnline.otroMetodoObsoleto();

    }


}

/*Añade a las clases hijas algunos métodos obsoletos (deprecated), y utiliza la anotación correspondiente.
Invoca desde una clase externa los métodos obsoletos, suprimiendo mediante la correspondiente anotación
los “warnings” para ser obsoletos.
*/
