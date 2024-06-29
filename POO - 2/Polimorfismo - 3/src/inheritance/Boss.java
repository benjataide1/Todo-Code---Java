package inheritance;

public class Boss extends Persona {

    int id_boss;
    String boss_flat;

    public Boss() {
    }

    public Boss(int id, String dni, String name, String last_name, String address, String phone, int id_boss, String boss_flat) {
        super(id, dni, name, last_name, address, phone);
        this.id_boss = id_boss;
        this.boss_flat = boss_flat;
    }

    public int getId_boss() {
        return this.id_boss;
    }

    public void setId_boss(int id_boss) {
        this.id_boss = id_boss;
    }

    public String getBoss_flat() {
        return this.boss_flat;
    }

    public void setBoss_flat(String boss_flat) {
        this.boss_flat = boss_flat;
    }
}
