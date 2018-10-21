public class Candy extends Sweets {
    private String filling;     //начинка

    Candy(String name, double price, double weight, String filling) {
        super(name, price, weight);
        this.filling = filling;
    }

    String getFilling() {
        return filling;
    }

    public String toString() {
        return super.toString() + " начинка: " + this.filling;
    }
}
