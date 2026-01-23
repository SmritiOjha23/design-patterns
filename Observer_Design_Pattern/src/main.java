public class main {
    public static void main(String[] args) throws Exception {
        OrderService order=new OrderService();
        EmailService email=new EmailService();
        SMSService sms=new SMSService();
        
        order.addObserver(email);
        order.addObserver(sms);

        order.setStatus("order placed");
    }
}
