package logic;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    @Override
    protected void attackPlacaje() {
        System.out.println("Hi, I'am squirtle and this is my attack Placaje");
    }

    @Override
    protected void attackAraniazo() {
        System.out.println("Hi, I'am squirtle and this is my attack Arniazo");
    }

    @Override
    protected void attackMordisco() {
        System.out.println("Hi, I'am squirtle and this is my attack Mordisco");
    }

    @Override
    public void attackHidrobomba() {
        System.out.println("Hi, I'am squirtle and this is my attack Hidrobomba");

    }

    //! Methods Interface IAgua
    @Override
    public void attackBurbuja() {
        System.out.println("Hi, I'am squirtle and this is my attack Burbuja");

    }

    @Override
    public void attackPistolaAgua() {
        System.out.println("Hi, I'am squirtle and this is my attack PistolaAgua");

    }
}