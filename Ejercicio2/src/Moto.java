public class Moto extends Vehiculo {
    private boolean cascoIncluido;

    public Moto(String marca, String modelo,
                double velocidadMaxima,
                boolean cascoIncluido) {

        super(marca, modelo, velocidadMaxima);
        this.cascoIncluido = cascoIncluido;
    }

    @Override
    public void describir() {
        System.out.println("MOTO");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima + " km/h");
        System.out.println("Casco incluido: " + cascoIncluido);
    }
}