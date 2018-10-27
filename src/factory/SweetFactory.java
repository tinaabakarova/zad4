package factory;

import sweets.*;

@FunctionalInterface
public interface SweetFactory<P extends Sweets>{
    P createSweets(String type, String name, double price, double weight, SweetTaste uniqueParameter);
}
