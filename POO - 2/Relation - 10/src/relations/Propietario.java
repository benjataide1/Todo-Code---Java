package relations;

public class Propietario {
    private Long id;
    private String name;
    private String last_name;

    public Propietario() {
    }

    public Propietario(Long id, String name, String last_name) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Propietario{");
        sb.append("id=").append(this.id);
        sb.append(", name='").append(this.name).append('\'');
        sb.append(", last_name='").append(this.last_name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
