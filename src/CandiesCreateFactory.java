public class CandiesCreateFactory implements SweetFactory {

    @Override
    public Sweets createSweets(String type, String name, double price, double weight, String uniqueParameter) {
        if (type.toLowerCase().equals("candy"))
            return new Candy(name, price, weight, uniqueParameter);
        else
            return null;
    }
}
