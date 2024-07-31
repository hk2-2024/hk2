package collection.map.test.cart;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, Integer cnt) {
        //System.out.println("cartMap.containsKey() = " + cartMap.containsKey(product));
        /*if (cartMap.containsKey(product)) {
            Integer count = cartMap.get(product);
            cartMap.put(product, (count + cnt));
        } else {
            cartMap.put(product, cnt);
        }*/
        int i2 = cartMap.getOrDefault(product, 0);
        cartMap.put(product, i2+cnt);

    }

    public void minus(Product product, int cnt) {
        Integer count = cartMap.get(product);
        if (count <= cnt) {
            cartMap.remove(product);
        } else {
            count -= cnt;
            cartMap.put(product, count);
        }
    }
    public void printAll() {
        System.out.println("상품 = " + cartMap);
    }
}
