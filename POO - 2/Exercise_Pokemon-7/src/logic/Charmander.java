package logic;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    protected void attackPlacaje() {
        System.out.println("Hi, I'am Charmander and this is my attack placaje");
    }

    @Override
    protected void attackAraniazo() {
        System.out.println("Hi, I'am Charmander and this is my attack Araniazo");

    }

    @Override
    protected void attackMordisco() {
        System.out.println("Hi, I'am Charmander and this is my attack Mordisco");

    }

    @Override
    public void attackPunioFuego() {
        System.out.println("Hi, I'am Charmander and this is my attack Fuego");

    }

    @Override
    public void attackLanzallamas() {
        System.out.println("Hi, I'am Charmander and this is my attack Lanzallamas");

    }

    @Override
    public void attackAscuas() {
        System.out.println("Hi, I'am Charmander and this is my attack Ascuas");

    }
}