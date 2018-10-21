public class JellyBean extends Sweets {
    private String taste;

    JellyBean(String name, double price, double weight, String taste) {
        super(name, price, weight);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public String toString() {
        return super.toString() + " вкус: " + this.taste;
    }
}
