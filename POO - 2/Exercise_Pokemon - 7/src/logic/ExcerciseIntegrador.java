package logic;

public class ExcerciseIntegrador {
    public static void main(String[] args) {


        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasur bulbasur = new Bulbasur();
        Pikachu pikachu = new Pikachu();


        squirtle.attackAraniazo();
        squirtle.attackHidrobomba();

        charmander.attackAraniazo();
        charmander.attackLanzallamas();

        bulbasur.attackAraniazo();
        bulbasur.attackDrenaje();

        pikachu.attackAraniazo();
        pikachu.attackImpactrueno();
    }
}