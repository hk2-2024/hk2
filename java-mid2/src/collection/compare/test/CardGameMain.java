package collection.compare.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CardGameMain {
    public static void main(String[] args) {
        List<Card> cardList = new ArrayList<>();


        for (int i = 0; i < 4; i++) {
            Card card;
            String image = "";
            switch(i) {
                case 0 : image = "\u2660"; break;
                case 1 : image = "\u2665"; break;
                case 2 : image = "\u2666"; break;
                case 3 : image = "\u2663"; break;
            /*    case 0 : image = "A"; break;
                case 1 : image = "B"; break;
                case 2 : image = "C"; break;
                case 3 : image = "D"; break;*/
            }
            for (int i2 = 1; i2 < 14; i2++) {
                card = new Card(image, i2);

                cardList.add(card);
            }
        }
        System.out.println("cardList.toString() = " + cardList.toString());



        Collections.shuffle(cardList);
        System.out.println("cardList.toString() = " + cardList.toString());

        List<Card> cardPlayer1 = new ArrayList<>();
        List<Card> cardPlayer2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i %2 == 1) {
                cardPlayer1.add(cardList.remove(i));
            } else {
                cardPlayer2.add(cardList.remove(i));

            }
        }

        int sum1=0;
        int sum2=0;
        cardPlayer1.sort(null);
        cardPlayer2.sort(null);
        //cardPlayer1.sort(cardPlayer1, new CardComparator());
        System.out.println("carPlayer1.toString() = " + cardPlayer1.toString());
        System.out.println("carPlayer2.toString() = " + cardPlayer2.toString());

        for (Card card : cardPlayer1) {

            sum1 += card.getNumber();

        }
        System.out.println("sum1 = " + sum1);
        for (Card card : cardPlayer2) {

            sum2 += card.getNumber();
        }
        System.out.println("sum2 = " + sum2);


    }

}
