package s01n01ex2;

public class Trabajador2Presencial extends Trabajador2 {
    private static double gasolina = 50.0;
    public Trabajador2Presencial(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + gasolina;
    }

    //anotación que indica que el método es obsoleto
    @Deprecated
    public void metodoObsoleto(){
        System.out.println("Este método esta obsoleto");
    }
}
