package s01n01ex1;

public class MainTrabajador {
    public static void main(String[] args) {
        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Juan","Cruz",25);
        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Ana","García",35);

        double horasTrabajadasPresencial = 40.0;
        double horasTrajadasOnline = 30;

        double sueldoPresencial = trabajadorPresencial.calcularSueldo(horasTrabajadasPresencial);
        double sueldoOnline = trabajadorOnline.calcularSueldo(horasTrajadasOnline);

        System.out.println("El sueldo del trabajador presencial es: " + sueldoPresencial);
        System.out.println("El sueldo del trabajador online es: " + sueldoOnline);

    }
}

/*Crea una jerarquía de objetos con tres clases: Trabajador, TrabajadorOnline y TrabajadorPresencial.

La clase Trabajador tiene los atributos nombre, apellido, precio/hora, y el método calcularSou() que recibe por
parámetro el número de horas trabajadas y lo multiplica por el precio/hora. Las clases hijas deben sobreescribirlo,
empleando @Override.

Desde el main() de la clase Principal, realiza las invocaciones necesarias para demostrar el funcionamiento
de la anotación @Override.

En los trabajadores presenciales, el método para calcular su sueldo, recibirá por parámetro el número de
horas trabajadas al mes. A la hora de calcular el sueldo se multiplicará el número de horas trabajadas
por el precio/hora, más el valor de un atributo static llamado gasolina que añadiremos en esta clase.

En los trabajadores online, el método para calcular su sueldo recibirá por parámetro el número de horas
trabajadas al mes. A la hora de calcular el sueldo se multiplicará el número de horas trabajadas
por el precio/hora y se le sumará el precio de la tarifa plana de Internet, que será una constante de
la clase Trabajador Online.
*/
