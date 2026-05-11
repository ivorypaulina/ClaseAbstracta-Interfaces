public class Circulo extends Figura implements Dibujable {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + radio);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String obtenerFormatoSVG() {
        return "<circle r=\"" + radio + "\" fill=\"" + color + "\"/>";
    }
}