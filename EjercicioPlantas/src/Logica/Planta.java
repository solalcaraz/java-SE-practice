package Logica;

public abstract class Planta {
    private String nombre;
    private double altoDelTallo;
    private boolean tieneHojas;
    private Clima climaIdeal;

    public Planta() {}

    public Planta(String nombre, double altoDelTallo, boolean tieneHojas, Clima climaIdeal) {
        this.nombre = nombre;
        this.altoDelTallo = altoDelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoDelTallo() {
        return altoDelTallo;
    }

    public void setAltoDelTallo(double altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public Clima getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(Clima climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public abstract void mostrarSaludo();
}
