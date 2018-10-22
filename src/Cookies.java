public class Cookies extends Sweets {
    private String glaze;

    Cookies(String name, double price, double weight, String glaze) {
        super(name, price, weight);
        this.glaze = glaze;
    }

    public String getGlaze() {
        return glaze;
    }

    public String toString() {
        return super.toString() + ", глазурь: " + this.glaze;
    }
}
