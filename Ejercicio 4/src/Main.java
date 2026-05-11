public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = {

                new EmpleadoPorHora("Yassin", 101, 40, 15
                ),
                new EmpleadoPorHora("Jonathan", 102, 35, 18
                ),
                new EmpleadoFijo("Dante", 201, 40, 1200
                ),
                new EmpleadoFijo("Alan", 202, 40, 1500
                ),
                new EmpleadoComision("Juan", 301, 40, 900, 10,
                        5000
                ),
                new EmpleadoComision("Freddy", 302, 40, 1000, 8,
                        7000
                )
        };

        for (Empleado e : empleados) {
            e.mostrarInfo();

            if (e instanceof Bonificable) {
                Bonificable b = (Bonificable) e;
                System.out.println("Bono: $" + b.calcularBono()
                );
            }

            System.out.println(
                    "----------------------"
            );
        }
    }
}