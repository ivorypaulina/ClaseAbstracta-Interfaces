public abstract class Figura {
    protected String color;
    protected boolean rellena;

    public Figura(String color, boolean rellena) {
        this.color = color;
        this.rellena = rellena;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void describir() {
        System.out.println("Color: " + color);
        System.out.println("Rellena: " + rellena);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}