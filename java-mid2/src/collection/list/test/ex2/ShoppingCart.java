package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        int total=0;
        for (int i = 0; i < items.size(); i++) {
            System.out.println("listName.get(i) = " + items.get(i).getName());
            System.out.println("listTotal.get(i) = " + items.get(i).getTotalPrice());
            total += items.get(i).getTotalPrice();
        }
        System.out.println("total = " + total);
    }

}
