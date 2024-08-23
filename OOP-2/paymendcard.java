public class PaymendCard {
    private double balance;

    public PaymendCard(double openingBalance) {
          this.balance=openingBalance;
    }
    
    @Override
    public String toString() {
        return "saldo ="+balance;
    }
}