package gumball;

public class GumballMachine implements Coinable, Dispensable{
    int gums = 0;
    public GumballMachine(){
        this.gums = 10;

    }

    @Override
    public boolean insertCoin() {
        if (this.gums > 0){
            this.dispense();
            return  true;
        }
        System.out.println("return coin");
        return false;
    }

    @Override
    public void dispense() {
        this.gums--;
        System.out.println("1 gum dispensed");
    }

    @Override
    public void reload(int count) {
        this.gums += count;
    }
}
