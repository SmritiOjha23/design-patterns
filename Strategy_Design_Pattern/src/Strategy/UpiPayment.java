package Strategy;

public class UpiPayment implements PaymentStrategy  {
    public void pay(int amount)
    {
        System.out.println(amount+" Paid by UPI");
    }
    
}
