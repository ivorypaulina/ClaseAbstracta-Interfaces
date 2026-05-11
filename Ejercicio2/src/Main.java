public class Main {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = {

                new Auto("Tesla", "Model 3", 250, 80),

                new Moto("Chevrolet", "R15", 180, true),

                new Camion("Toyota", "FH16", 140, 20)
        };

        for (Vehiculo v : vehiculos) {
            v.describir();
            System.out.println();

            if (v instanceof Electrico) {

                Electrico e = (Electrico) v;

                e.cargarBateria(10);

                System.out.println("Autonomia: " +
                        e.autonomiaKm() +
                        " km");
            }
            System.out.println("-------------------");
        }
    }
}