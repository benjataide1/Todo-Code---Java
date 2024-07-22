package Plantas;

public class Flower extends Plant {

    private String colorPetalo;

    private int cantPetalos;
    private String colorPistillo;
    private String variety;
    private String season;

    public Flower() {
    }

    public Flower(String name, double altoTallo, boolean tieneHojas, String weather, int cantPetalos, String colorPetalo, String colorPistillo, String season, String variety) {
        super(name, altoTallo, tieneHojas, weather);
        this.cantPetalos = cantPetalos;
        this.colorPetalo = colorPetalo;
        this.colorPistillo = colorPistillo;
        this.season = season;
        this.variety = variety;
    }

    public int getCantPetalos() {
        return cantPetalos;
    }

    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
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

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public void tellIam() {
        System.out.println("I am a Flower");
    }
}
