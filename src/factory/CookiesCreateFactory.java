package factory;

import sweets.*;

public class CookiesCreateFactory implements SweetFactory {
    @Override
    public Sweets createSweets(String type, String name, double price, double weight, SweetTaste uniqueParameter) {
        if (type.toLowerCase().equals("cookies"))
            return new Cookies(name, price, weight, uniqueParameter);
        else
            return null;
    }
}
