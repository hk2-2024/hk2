package collection.compare.test;

import collection.compare.MyUser;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return o1.getImage().compareTo(o2.getImage());
    }
}

