package arcade;

public class Person {
   private int coins;

   public Person(int coins){
       this.coins=coins;
   }
   public void insertCoin(Coinable coinable){
       System.out.println("Coin Balance: "+coins);
       if(!coinable.insertCoin());
       coins--;
   }
}
