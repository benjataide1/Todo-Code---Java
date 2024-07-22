package Plantas;

public abstract class Plant {
    private String name;
    private double altoTallo;
    private boolean tieneHojas;
    private String weather;

    public Plant() {
    }

    public Plant(String name, double altoTallo, boolean tieneHojas, String weather) {
        this.name = name;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.weather = weather;
    }

    public double getAltoTallo() {
        return this.altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTieneHojas() {
        return this.tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getWeather() {
        return this.weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    protected abstract void tellIam();



}
