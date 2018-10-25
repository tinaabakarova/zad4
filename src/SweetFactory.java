@FunctionalInterface
public interface SweetFactory {
    public abstract Sweets createSweets(String type, String name, double price, double weight, String uniqueParameter);
}
