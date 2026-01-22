import Strategy.CardPayment;
import Strategy.UpiPayment;

public class main {
    public static void main(String[] args) throws Exception {
        PaymentService service=new PaymentService();
        service.setStrategy(new CardPayment());
        service.pay(50);

        service.setStrategy(new UpiPayment());
        service.pay(100);
    }
}
