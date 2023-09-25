public class Warehouse {

   private int balance;
   private  int  countOrder; // количество собранных заказов

   @Override
   public String toString() {
      return "Warehouse{" +
              "balance=" + balance +
              ", countOrder=" + countOrder +
              '}';
   }

   public int getBalance() {
      return balance;
   }

   public void setBalance(int balance) {
      this.balance = balance;
   }

   public int getCountOrder() {
      return countOrder;
   }

   public void setCountOrder(int countOrder) {
      this.countOrder = countOrder;
   }
}
