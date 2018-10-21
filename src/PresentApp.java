public class PresentApp {
    public static void main(String[] args) {
        Present present = new Present();

        Candy candy = new Candy("Candy", 2.3, 1, "Chocolade");
        present.addSweets(new Candy("Candy", 2.3, 1, "Chocolade"), 5);
        present.addSweets(new Cookies("Cookie", 1, 2.1, "Chocolade"), 3);
        present.addSweets(new JellyBean("JellyBean", 0.3, 0.5, "Vanilla"), 8);
        present.addSweets(new Marshmallow("Marshmallow", 1.5, 0.3, "Pink"), 5);

        present.removeSweets(candy);

        present.showPresent();
    }

}
