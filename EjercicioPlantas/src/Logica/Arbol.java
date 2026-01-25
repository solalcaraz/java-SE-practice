package Logica;

public class Arbol extends Planta{
    private String variedad, tipoDeTronco, color, tipoDeHojas;
    private double radioDelTronco;

    public Arbol() {}

    public Arbol(String nombre, double altoDelTallo, boolean tieneHojas, Clima climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    public double getRadioDelTronco() {
        return radioDelTronco;
    }

    public void setRadioDelTronco(double radioDelTronco) {
        this.radioDelTronco = radioDelTronco;
    }

    @Override
    public void mostrarSaludo() {
        System.out.println("Hola soy un arbol");
    }
}
