package Lucas;

public class Main {
    public static void main(String[] args) {
        EmpleadoPorHoras empleadoh1 = new EmpleadoPorHoras("Raul", 20, 20);
        empleadoh1.calcularSalario();
        EmpleadoTiempoCompleto empleadot1 = new EmpleadoTiempoCompleto("Lucas", 19, 1900);
        empleadot1.calcularSalario();
    }
}
