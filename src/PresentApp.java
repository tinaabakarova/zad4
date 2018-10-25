public class PresentApp {
    public static void main(String[] args) {
        Present present = new Present();
        SweetFactory candiesFactory = new CandiesCreateFactory();
        SweetFactory cookiesFactory = new CookiesCreateFactory();
        Sweets candy2 = candiesFactory.createSweets("Candy", "Candy",2.3, 1, "Chocolade");
        Sweets candy = candiesFactory.createSweets("candy", "Candy", 1.2, 2, "White chocolate");
        Sweets cookie = cookiesFactory.createSweets("Cookies", "Cookies", 5, 3.2, "With blueberry");

        //реализация фабрики через лямбды
        //jellybean
        SweetFactory jellybeanFactory = (type, name, price, weight, uniqueParameter) ->  {
            if (type.toLowerCase().equals("jellybean"))
                return new JellyBean(name, price, weight, uniqueParameter);
            else
                return null;
        };
        Sweets jellybean = jellybeanFactory.createSweets("Jellybean", "JellyBean", 1.2, 2, "Strawberry");

        //marshmallow
        SweetFactory marshmallowFactory = (type, name, price, weight, uniqueParameter) -> {
            if (type.toLowerCase().equals("marshmallow"))
                return new Marshmallow(name, price, weight, uniqueParameter);
            else
                return null;
        };
        Sweets marshmallow = marshmallowFactory.createSweets("Marshmallow", "Marshmallow", 2.9, 0.3, "Pink");

        present.addSweets(candy, 3);
        present.addSweets(candy2, 2);
        present.addSweets(jellybean, 3);
        present.addSweets(cookie, 2);
        present.addSweets(marshmallow, 5);

        present.removeSweets(candy);

        present.showPresent();
    }

}
