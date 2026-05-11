public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected double velocidadMaxima;

    public Vehiculo(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void describir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima + " km/h");
    }
}
