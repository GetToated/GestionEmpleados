package Lucas;

public class EmpleadoPorHoras extends Empleado{
    private int salariohora;
    public EmpleadoPorHoras (String nombre, int edad, int salariohora) {
        super(nombre, edad);
        this.salariohora = salariohora;
    }
    public void calcularSalario() {
        int i = salariohora * 30;
        System.out.println("Su salario por mes es: " + i);
    }
}
