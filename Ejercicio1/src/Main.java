public class Main {
    public static void main(String[] args) {

        Figura[] figuras = {
                new Circulo("rojo", 5.0),
                new Rectangulo("azul", 4.0, 6.0),
                new Triangulo("verde", 3.0, 4.0)
        };

        for (Figura f : figuras) {
            f.describir();
            if (f instanceof Dibujable) {

                Dibujable d = (Dibujable) f;

                d.dibujar();

                System.out.println("Perimetro: " + d.perimetro());

                System.out.println(d.obtenerFormatoSVG());
            }

            System.out.println();
        }
    }
}