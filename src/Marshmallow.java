public class Marshmallow extends Sweets {
    private String color;

    Marshmallow(String name, double price, double weight, String color) {
        super(name, price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return super.toString() + " цвет: " + this.color;
    }
}
