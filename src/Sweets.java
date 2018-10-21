public abstract class Sweets {
    private double weight;
    private double price;
    private String name;

    Sweets(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
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

    public String toString() {
        return "" + this.name + ", " + this.price + ", " + this.weight;
    }
}
