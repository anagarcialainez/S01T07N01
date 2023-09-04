package s01n01ex1;

public class TrabajadorPresencial extends Trabajador{
    private static double gasolina = 50.0;
    public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + gasolina;
    }
}
