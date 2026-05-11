public abstract class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea();

    public void describir() {
        System.out.println("======================================");
        System.out.println("Figura de color: " + color);
        System.out.println("Area: " + calcularArea());
    }
}