public abstract class Sweets {
    private double weight;
    private double price;
    private String name;
    private String uniqueParameter;

    Sweets(String name, double price, double weight, String uniqueParameter) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.uniqueParameter = uniqueParameter;
    }

    double getPrice() {
        return price;
    }

    double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getUniqueParameter() {return uniqueParameter;}

    public String toString() {
        return "" + this.name + ", " + this.price + ", " + this.weight + ", " + this.uniqueParameter;
    }
}
