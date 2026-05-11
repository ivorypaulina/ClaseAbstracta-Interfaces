public class Auto extends Vehiculo implements Electrico {
    private int bateria;

    public Auto(String marca, String modelo,
                double velocidadMaxima, int bateria) {

        super(marca, modelo, velocidadMaxima);
        this.bateria = bateria;
    }

    @Override
    public void describir() {
        System.out.println("AUTO");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " +
                velocidadMaxima + " km/h");
        System.out.println("Bateria: " + bateria + "%");
    }

    @Override
    public void cargarBateria(int porcentaje) {
        bateria += porcentaje;

        if (bateria > 100) {
            bateria = 100;
        }
        System.out.println("Bateria cargada al " +
                bateria + "%");
    }

    @Override
    public int autonomiaKm() {
        return bateria * 5;
    }
}