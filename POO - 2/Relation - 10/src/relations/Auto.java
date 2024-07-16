package relations;

import java.util.List;

public class Auto {
    private Long id;
    private String brand;
    private String model;

    //* 1 - 1 , dependiendo del contexto se sabe donde va el 1 a 1
//    private Propietario prop;

    //* 1 - N, del lago del 1 hago la relacion, - En mi constructor y Metodos, yo recibo una List<>
    private List<Propietario> prop;

    public Auto() {
    }

    public Auto(Long id, String brand, String model, List<Propietario> prop) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.prop = prop;
    }

    public List<Propietario> getProp() {
        return this.prop;
    }

    public void setProp(List<Propietario> prop) {
        this.prop = prop;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Auto{");
        sb.append("id=").append(this.id);
        sb.append(", brand='").append(this.brand).append('\'');
        sb.append(", model='").append(this.model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
