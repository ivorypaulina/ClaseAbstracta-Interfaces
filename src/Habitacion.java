abstract class Habitacion {

    //Atributos
    private String codigo;
    private String tipoHabitacion;
    private double tarifaBase;
    private int numeroNoches;
    private boolean disponible;

    public Habitacion(String codigo, String tipoHabitacion, double tarifaBase, int numeroNoches, boolean disponible) {
        this.codigo = codigo;
        this.tipoHabitacion = tipoHabitacion;
        setNumeroNoches(numeroNoches);
        setTarifaBase(tarifaBase);
        this.disponible = disponible;
    }

    public abstract double calcularHospedaje();
    public abstract void mostrarDetalle();

    public boolean verificarDisponibilidad() {
        return disponible;
    }

    //Setters y Getters
    public void setNumeroNoches(int numeroNoches) {
        if (numeroNoches > 0)
            this.numeroNoches = numeroNoches;
        else
            this.numeroNoches = 1;
    }

    public void setTarifaBase(double tarifaBase) {
        if (tarifaBase > 0)
            this.tarifaBase = tarifaBase;
        else
            this.tarifaBase = 10;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
}