package arraylist;

public class Main {
    public static void main(String[] args) {

        Meyve basket = new Meyve();


        basket.addFruit("خیار");
        basket.addFruit("گیلانار");
        basket.addFruit("الچه");


        basket.displayFruits();


        String firstFruit = basket.getFruit(0);
        System.out.println("First Fruit: " + firstFruit);


        basket.updateFruit(1, "اریح");
        System.out.println("Updated Fruits:");
        basket.displayFruits();


        basket.removeFruit(2);
        System.out.println("Fruits after removal:");
        basket.displayFruits();

        int size = basket.getSize();
        System.out.println("Size of FruitBasket: " + size);

        boolean hasApple = basket.containsFruit("اریح");
        System.out.println("FruitBasket contains 'اریح': " + hasApple);


        basket.clearFruits();
        System.out.println("Fruits after clearing:");
        basket.displayFruits();
    }
}
