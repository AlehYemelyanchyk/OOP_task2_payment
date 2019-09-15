package by.epam.ayem.module5;

/*Задача 2.
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку
из нескольких товаров.*/

public class PaymentMain {

    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.Goods bread = payment.new Goods("Bread", Payment.Units.PIECE, 2, 3.29);
        Payment.Goods milk = payment.new Goods("Milk", Payment.Units.LITER, 1, 1.39);
        Payment.Goods nuts = payment.new Goods("Nuts", Payment.Units.KG, 1.4, 0.99);
        payment.addGoods(bread);
        payment.addGoods(milk);
        payment.addGoods(nuts);
        payment.showBasket();
    }
}
