package arcade;


public class ArcadeMachine implements Coinable, Dispensable {
    int coins;

    public ArcadeMachine(){
        this.coins=0;
    }
    public void dispense() {


        System.out.println("Ready to play");
        System.out.println("Start!");
        System.out.println("");
        coins++;

    }
    public boolean insertCoin() {

        this.dispense();
        return true;
    }

    @Override
    public void reload(int count) {

    }
}