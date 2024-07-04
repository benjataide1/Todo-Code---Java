package logic;

public class Bulbasur extends Pokemon implements IPlanta {


    public Bulbasur() {

    }

    @Override
    protected void attackPlacaje() {
        System.out.println("Hi, I'am bulbasur and this is my attack placaje");
    }

    @Override
    protected void attackAraniazo() {
        System.out.println("Hi, I'am bulbasur and this is my attack araniazo");

    }

    @Override
    protected void attackMordisco() {
        System.out.println("Hi, I'am bulbasur and this is my attack mordisco");

    }

    //! Methods Interface IPlanta
    @Override
    public void attackDrenaje() {
        System.out.println("Hi, I'am bulbasur and this is my attack Drenaje");
    }

    @Override
    public void attackParalizar() {
        System.out.println("Hi, I'am bulbasur and this is my attack Paralizar");
    }
}