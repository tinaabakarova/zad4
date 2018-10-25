public class CookiesCreateFactory implements SweetFactory {
    @Override
    public Sweets createSweets(String type, String name, double price, double weight, String uniqueParameter) {
        if (type.toLowerCase().equals("cookies"))
            return new Cookies(name, price, weight, uniqueParameter);
        else
            return null;
    }
}
