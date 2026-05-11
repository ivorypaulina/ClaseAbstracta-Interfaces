public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, double velocidadMaxima, double capacidadCarga) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void describir() {

        System.out.println("CAMION");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima + " km/h");
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }
}