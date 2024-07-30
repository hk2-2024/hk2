package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> listName = new ArrayList<>();
    private List<Integer> listTotal = new ArrayList<>();

    public  void addItem(Item item) {
        listName.add(item.getName());
        listTotal.add(item.getTotalPrice());
    }

    public void displayItems() {
        int total=0;
        for (int i = 0; i < listTotal.size(); i++) {
            System.out.println("listName.get(i) = " + listName.get(i));
            System.out.println("listTotal.get(i) = " + listTotal.get(i));
            total += listTotal.get(i);
        }
        System.out.println("total = " + total);
    }

}
