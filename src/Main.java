import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del huésped: ");
        String nombre = sc.nextLine();

        System.out.print("Número de noches: ");
        int noches = sc.nextInt();

        System.out.println("Tipo de habitación (1: Simple, 2: Suite, 3: Familiar): ");
        int tipo = sc.nextInt();

        Habitacion habitacion = null;

        if (tipo == 1) {
            habitacion = new HabitacionSimple("H001", noches);
        } else if (tipo == 2) {
            habitacion = new Suite("H002", noches);
        } else {
            System.out.print("Número de personas: ");
            int personas = sc.nextInt();
            habitacion = new HabitacionFamiliar("H003", noches, personas);
        }

        double subtotal = habitacion.calcularHospedaje();

        double descuento = (noches > 5) ? subtotal * 0.1 : 0;
        double iva = subtotal * 0.15;
        double total = subtotal - descuento + iva;

        System.out.println("\n===== FACTURA =====");
        System.out.println("Huésped: " + nombre);
        System.out.println("Tipo: " + habitacion.getTipoHabitacion());
        habitacion.mostrarDetalle();
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("IVA: " + iva);
        System.out.println("TOTAL: " + total);
    }
}