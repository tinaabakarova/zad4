import sweets.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

class Present {
    private double price = 0;
    private double weight = 0;
    private Map<Sweets, Integer> map;
    private Set<Sweets> set;
    private Predicate<Sweets> predicate;

    Present() {
        this.map = new HashMap<>();
    }

    void addSweets(Sweets obj, Integer count) {
        if (predicate.test(obj)) {
            if (map.containsKey(obj)) {
                int value = map.get(obj);
                map.put(obj, value + count);
            } else {
                map.put(obj, count);
            }
        }
    }

    void removeSweets(Sweets obj) {
        map.remove(obj);
    }

    public double countPrice() {
        double elementPrice;                //цена одного виа сладостей в подарке

        for (Map.Entry<Sweets, Integer> entry : map.entrySet()) {
            elementPrice = entry.getValue() * entry.getKey().getPrice();
            price = price + elementPrice;
        }

        return price;
    }

     public double countWeight() {
        double elementWeight;           //вес одного вида сладостей в подарке

        for (Map.Entry<Sweets, Integer> entry : map.entrySet()) {
            elementWeight = entry.getValue() * entry.getKey().getWeight();
            weight = weight + elementWeight;
        }

        return weight;
    }

    void showPresent() {
        for (Map.Entry<Sweets, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + ", количество: " + entry.getValue());
        }
        System.out.println("Общий вес подарка: " + this.countWeight());
        System.out.println("Цена подарка: " + this.countPrice());
    }

    //Пункт 2
    void setPolicity(Predicate<Sweets> predicate ){
        this.predicate = predicate;
    }

    //Пункт 4
    void showSweetsNames(){
        set = map.keySet();
        System.out.print("Сладости в подарке: ");
        set.forEach(x -> System.out.print(x.getName() + " "));
        System.out.println();
    }

    //Пункт 4
    void showSweetsWithWeightMoreThan(Double parameter){
        set = map.keySet();
        System.out.println("Подарки с весом больше " + parameter + ": ");
        set.stream().filter(x -> x.getWeight() > parameter)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }


}
