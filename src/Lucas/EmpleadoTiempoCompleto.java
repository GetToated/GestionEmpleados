package Lucas;

public class EmpleadoTiempoCompleto extends Empleado{
    private int salarioanual;
    public EmpleadoTiempoCompleto(String nombre, int edad, int salarioanual) {
        super(nombre, edad);
        this.salarioanual = salarioanual;
    }
    public void calcularSalario() {
        int i = salarioanual * 12;
        System.out.println("Su salario anual es de: " + i);

    }
}
