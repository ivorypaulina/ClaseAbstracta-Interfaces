public class Main {

    public static void main(String[] args) {

        Figura[] figuras = {

                new Circulo("Rosa", true, 6),

                new Circulo("Azul", false, 3),

                new Rectangulo("Verde", true, 9, 12),

                new Rectangulo("Turquesa", false, 15, 18),

                new TrianguloRectangulo("Negro", true, 2, 4),

                new TrianguloRectangulo("Blanco", false, 7, 12)
        };

        for (Figura f : figuras) {
            f.describir();
            System.out.println("----------------");
        }
    }
}