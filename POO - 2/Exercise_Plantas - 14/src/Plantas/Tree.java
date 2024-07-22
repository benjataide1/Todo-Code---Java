package Plantas;

public class Tree extends Plant {

    private String variety;

    private String typeTronco;
    private double radioTronco;
    private String color;
    private String typeHojas;

    public Tree() {
    }

    public Tree(String name, double altoTallo, boolean tieneHojas, String weather, String color, double radioTronco, String typeHojas, String typeTronco, String variety) {
        super(name, altoTallo, tieneHojas, weather);
        this.color = color;
        this.radioTronco = radioTronco;
        this.typeHojas = typeHojas;
        this.typeTronco = typeTronco;
        this.variety = variety;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getTypeHojas() {
        return typeHojas;
    }

    public void setTypeHojas(String typeHojas) {
        this.typeHojas = typeHojas;
    }

    public String getTypeTronco() {
        return typeTronco;
    }

    public void setTypeTronco(String typeTronco) {
        this.typeTronco = typeTronco;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override

    public void tellIam() {
        System.out.println("I am a Tree");
    }
}
