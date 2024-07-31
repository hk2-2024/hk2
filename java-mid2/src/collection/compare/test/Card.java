package collection.compare.test;

import collection.compare.MyUser;

import java.util.Objects;




public class Card implements Comparable<Card>{
    private String image;
    private Integer number;

    public Card(String image, Integer number) {
        this.image = image;
        this.number = number;
    }

    public String getImage() {
        return image;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Card card = (Card) object;
        return Objects.equals(image, card.image) && Objects.equals(number, card.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, number);
    }
    @Override
    public int compareTo(Card o) {
        //return this.number < o.number ? -1 : (this.number == o.number ? 0 : 1);
        if (this.number != o.number) {
            return this.number - o.number;
        } else {
            return this.image.compareTo(o.image);
        }
    }

    @Override
    public String toString() {
        return number+"("+image+")";
    }
}
