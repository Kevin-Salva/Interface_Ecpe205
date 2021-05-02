package gumball;

public class Person {
    private int coins;


    public Person(int coins) {

        this.coins = coins;

    }

    public void insertCoin(Coinable coinable, int coins) {
        System.out.println("Coin inserted:" + coins);
        if (coins > 1) {

            if (!coinable.insertCoin()) {
                coins++;
                System.out.println("coin refunded");
            }
            else {
                coins -=2;
            }
            System.out.println("coin count: " + coins);
        }
    }
}
