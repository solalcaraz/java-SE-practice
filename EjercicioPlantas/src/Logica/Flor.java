package Logica;

public class Flor extends Planta {
    private String colorPetalo, colorPistillo, variedad;
    private double cantidadPromedioPetalos;
    private Estacion estacionFlorece;

    public Flor() {}

    public Flor(String nombre, double altoDelTallo, boolean tieneHojas, Clima climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
    }

    public String getColorPetalo() {
        return colorPetalo;
    }

    public void setColorPetalo(String colorPetalo) {
        this.colorPetalo = colorPetalo;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public double getCantidadPromedioPetalos() {
        return cantidadPromedioPetalos;
    }

    public void setCantidadPromedioPetalos(double cantidadPromedioPetalos) {
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
    }

    public Estacion getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(Estacion estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public void mostrarSaludo() {
        System.out.println("Hola soy una flor");
    }
}
