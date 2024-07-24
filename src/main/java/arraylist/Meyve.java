package arraylist;

import java.util.ArrayList;

public class Meyve {
    private ArrayList<String> fruits;


    public Meyve() {
        fruits = new ArrayList<>();
    }

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }


    public String getFruit(int index) {
        if (index >= 0 && index < fruits.size()) {
            return fruits.get(index);
        } else {
            return null;
        }
    }

    public void updateFruit(int index, String newFruit) {
        if (index >= 0 && index < fruits.size()) {
            fruits.set(index, newFruit);
        }
    }


    public void removeFruit(int index) {
        if (index >= 0 && index < fruits.size()) {
            fruits.remove(index);
        }
    }


    public int getSize() {
        return fruits.size();
    }

    public boolean containsFruit(String fruit) {
        return fruits.contains(fruit);
    }

    public void clearFruits() {
        fruits.clear();
    }

    public void displayFruits() {
        System.out.println("Fruits in the basket:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}