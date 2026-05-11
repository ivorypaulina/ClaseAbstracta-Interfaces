public class TrianguloRectangulo extends Figura {
    private double a;
    private double b;

    public TrianguloRectangulo(String color, boolean rellena, double a, double b) {
        super(color, rellena);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcularArea() {
        return (a * b) / 2;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa =
                Math.sqrt((a * a) + (b * b));
        return a + b + hipotenusa;
    }
}