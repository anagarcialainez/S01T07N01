package s01n01ex1;

public class TrabajadorOnline extends Trabajador {
    private static final double tarifaInternet = 30.0;

    public TrabajadorOnline(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + tarifaInternet;
    }
}
