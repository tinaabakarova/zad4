package sweets;

public class Sweets {
    private double weight;
    private double price;
    private String name;
    private SweetTaste uniqueParameter;

    public Sweets(String name, double price, double weight, SweetTaste uniqueParameter) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.uniqueParameter = uniqueParameter;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public SweetTaste getUniqueParameter() {return uniqueParameter;}

    public String toString() {
        return "" + this.name + ", " + this.price + ", " + this.weight + ", " + this.uniqueParameter;
    }
}
