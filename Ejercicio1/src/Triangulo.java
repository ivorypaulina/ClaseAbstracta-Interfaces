public class Triangulo extends Figura implements Dibujable {

    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando triangulo de base " +
                base + " y altura " + altura);
    }

    @Override
    public double perimetro() {
        return base + altura +
                Math.sqrt((base * base) + (altura * altura));
    }

    @Override
    public String obtenerFormatoSVG() {
        return "<polygon points=\"0,0 " + base + ",0 " + (base / 2) + "," + altura + "\" fill=\"" + color + "\"/>";
    }
}