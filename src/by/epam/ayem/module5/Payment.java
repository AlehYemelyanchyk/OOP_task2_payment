package by.epam.ayem.module5;

/*Задача 2.
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку
из нескольких товаров.*/

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private List<Goods> goods;

    public Payment() {
        goods = new ArrayList<>();
    }

    public void addGoods(Goods goods) {
        this.goods.add(goods);
    }

    public void showBasket() {
        int number = 1;
        double price = 0;
        for (Goods item : goods) {
            System.out.println(number + item.toString());
            number++;
            price += (item.priceForUnit * item.amount);
        }
        System.out.println("Total price = " + price);
    }

    public class Goods {

        private String name;
        private Units units;
        private double amount;
        private double priceForUnit;

        public Goods(String name, Units units, double amount, double priceForUnit) {
            this.name = name;
            this.units = units;
            this.amount = amount;
            this.priceForUnit = priceForUnit;
        }

        @Override
        public String toString() {
            return ". " + name + ", " + amount + " " + units.getUnits() + ". " +
                    "For payment: " + (priceForUnit * amount) + ".";
        }
    }

    public enum Units {

        KG("kg"), PIECE("pcs"), LITER("liter");

        private String units;

        Units(String units) {
            this.units = units;
        }

        public String getUnits() {
            return units;
        }
    }

}
