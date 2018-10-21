import java.util.HashMap;
import java.util.Map;

class Present {
    private double price = 0;
    private double weight = 0;
    private Map<Sweets, Integer> map;

    Present() {
        this.map = new HashMap<>();
    }

    void addSweets(Sweets obj, Integer count) {
        if (map.containsKey(obj)) {
            int value = map.get(obj);
            map.put(obj, value + count);
        } else {
            map.put(obj, count);
        }

    }

    void removeSweets(Sweets obj) {
        map.remove(obj);
    }

    private double countPrice() {
        double elementPrice;                //цена одного виа сладостей в подарке

        for (Map.Entry<Sweets, Integer> entry : map.entrySet()) {
            elementPrice = entry.getValue() * entry.getKey().getPrice();
            price = price + elementPrice;
        }

        return price;
    }

    private double countWeight() {
        double elementWeight;           //вес одного вида сладостей в подарке

        for (Map.Entry<Sweets, Integer> entry : map.entrySet()) {
            elementWeight = entry.getValue() * entry.getKey().getWeight();
            weight = weight + elementWeight;
        }

        return weight;
    }

    void showPresent() {
        for (Map.Entry<Sweets, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + " количество: " + entry.getValue());
        }
        System.out.println("Общий вес подарка: " + this.countWeight());
        System.out.println("Цена подарка: " + this.countPrice());
    }
}
