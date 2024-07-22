package Plantas;

public class Shrub extends Plant {


    private double witdhShrub;
    private boolean esDoemestico;
    private String variety;
    private String colorHojas;
    private boolean sePoda;

    public Shrub() {
    }

    public Shrub(String name, double altoTallo, boolean tieneHojas, String weather, String colorHojas, boolean esDoemestico, boolean sePoda, String variety, double witdhShrub) {
        super(name, altoTallo, tieneHojas, weather);
        this.colorHojas = colorHojas;
        this.esDoemestico = esDoemestico;
        this.sePoda = sePoda;
        this.variety = variety;
        this.witdhShrub = witdhShrub;
    }


    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isEsDoemestico() {
        return esDoemestico;
    }

    public void setEsDoemestico(boolean esDoemestico) {
        this.esDoemestico = esDoemestico;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public double getWitdhShrub() {
        return witdhShrub;
    }

    public void setWitdhShrub(double witdhShrub) {
        this.witdhShrub = witdhShrub;
    }

    @Override
    public void tellIam() {
        System.out.println("I am a Shrub");
    }
}
