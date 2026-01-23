public class EmailService implements Observer{
    public void update(String message)
    {
        System.out.println("EmailSent");
    }
}
