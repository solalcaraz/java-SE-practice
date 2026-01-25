package Logica;

public class Arbusto extends Planta {
    private double ancho;
    private  boolean esDomestico, sePodaONo;
    private String variedad, colorHojas;

    public Arbusto() {}

    public Arbusto(String nombre, double altoDelTallo, boolean tieneHojas, Clima climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    @Override
    public void mostrarSaludo() {
        System.out.println("Hola soy un arbusto");
    }
}
