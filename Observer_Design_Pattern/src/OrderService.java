import java.util.ArrayList;
import java.util.List;

public class OrderService implements Subject{
    List<Observer> observers=new ArrayList<>();
    private String status;
    public void addObserver(Observer o)
    {
        observers.add(o);
    }
    public void removeObserver(Observer o)
    {
        observers.remove(o);
    }
    public void notifyObservers()
    {
        for(Observer o: observers)
            o.update(status);
    }
    public void setStatus(String status)
    {
        this.status=status;
        notifyObservers();
    }
}
