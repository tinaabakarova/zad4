package factory;
import sweets.*;

public class CandiesCreateFactory implements SweetFactory {

    @Override
    public Candy createSweets(String type, String name, double price, double weight, SweetTaste uniqueParameter) {
        if (type.toLowerCase().equals("candy"))
            return new Candy(name, price, weight, uniqueParameter);
        else
            return null;
    }
}
