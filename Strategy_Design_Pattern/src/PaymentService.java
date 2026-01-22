import Strategy.PaymentStrategy;

public class PaymentService {
    PaymentStrategy obj;
    void setStrategy(PaymentStrategy obj)
    {
        this.obj=obj;
    }
    void pay(int amount)
    {
        obj.pay(amount);
    }
}
