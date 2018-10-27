import factory.*;
import sweets.*;
import converter.*;

public class PresentApp {
    public static void main(String[] args) {
        Present present = new Present();
        SweetFactory candiesFactory = new CandiesCreateFactory();
        SweetFactory cookiesFactory = new CookiesCreateFactory();
        Sweets candy2 = candiesFactory.createSweets("sweets.sweets.Candy", "sweets.sweets.Candy",2.3, 1, SweetTaste.CHOCOLADE);
        Sweets candy = candiesFactory.createSweets("candy", "sweets.sweets.Candy", 1.2, 2, SweetTaste.BLUEBERRIE);
        Sweets cookie = cookiesFactory.createSweets("sweets.sweets.Cookies", "sweets.sweets.Cookies", 5, 3.2, SweetTaste.NUTS);

        //Пункт 2: реализация фабрики через лямбды
        //jellybean
        SweetFactory<Sweets> jellybeanFactory = (type, name, price, weight, uniqueParameter) ->  {
            if (type.toLowerCase().equals("jellybean"))
                return new JellyBean(name, price, weight, uniqueParameter);
            else
                return null;
        };
        Sweets jellybean = jellybeanFactory.createSweets("Jellybean", "sweets.sweets.JellyBean", 1.2, 2, SweetTaste.LIQUER);

        //marshmallow
        SweetFactory marshmallowFactory = (type, name, price, weight, uniqueParameter) -> {
            if (type.toLowerCase().equals("marshmallow"))
                return new Marshmallow(name, price, weight, uniqueParameter);
            else
                return null;
        };
        Sweets marshmallow = marshmallowFactory.createSweets("sweets.sweets.Marshmallow", "sweets.sweets.Marshmallow", 2.9, 0.3, SweetTaste.STRAWBERRY);

        //Добавить, удалить, показать сладости в подарке
        //Установить политику
        present.setPolicity(x -> x.getWeight() > 2);
        present.addSweets(candy, 3);
        present.addSweets(candy2, 2);
        present.addSweets(jellybean, 3);
        present.addSweets(cookie, 2);
        present.addSweets(marshmallow, 5);
        present.removeSweets(candy);
        present.showPresent();

        //Пункт 3: конвертер
        DollarConverter dollarConverter = new DollarConverter();
        System.out.println("USD: " + dollarConverter.convert(present.countPrice()));

        EurosConverter eurosConverter = new EurosConverter();
        System.out.println("EUR: " + eurosConverter.convert(present.countPrice()));

        //через лямбды
        Converter<Double, Double> poundConverter = from -> from * 0.012;
        System.out.println("GBP: " + poundConverter.convert(present.countPrice()));

        //Пункт 4: StreamAPI
        present.showSweetsNames();
        present.showSweetsWithWeightMoreThan(2.0);

    }

}
