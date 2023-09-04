package s01n01ex2;

public class Trabajador2Online extends Trabajador2 {
    private static final double tarifaInternet = 30.0;

    public Trabajador2Online(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + tarifaInternet;
    }

    //agregando método obsoleto
    @Deprecated
    public void otroMetodoObsoleto(){
        System.out.println("Este método támbien esta obsoleto");
    }
}
