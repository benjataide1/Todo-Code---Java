package logic;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    protected void attackPlacaje() {
        System.out.println("Hi, I'am Pikachu and this is my attack Placaje");
    }

    @Override
    protected void attackAraniazo() {
        System.out.println("Hi, I'am Pikachu and this is my attack Arniazo");
    }

    @Override
    protected void attackMordisco() {
        System.out.println("Hi, I'am Pikachu and this is my attack Mordisco");
    }

    @Override
    public void attackImpactrueno() {
        System.out.println("Hi, I'am Pikachu and this is my attack Impactrueno");

    }

    @Override
    public void attackPunioTrueno() {
        System.out.println("Hi, I'am Pikachu and this is my attack PunioTrueno");
    }
}