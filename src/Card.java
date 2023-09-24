import java.sql.Array;
import java.util.Objects;

public class Card {

    private String suit;
    private String symbol;
    private Integer value;
    static String [] representation;


    public Card() {
        this.representation  = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    }

    public Card(Integer value, String suit) {
        this.suit = suit;
        this.value = value;
        this.representation  = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    }

    public Card(String suit , String symbol, Integer value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value= value;
        this.representation  = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    }

    public Card(Integer value, String suit, String symbol) {
        this.suit = suit;
        this.symbol = symbol;
        this.value= value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String[] getRepresentation() {
        return representation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(suit, card.suit) && Objects.equals(symbol, card.symbol) && Objects.equals(value, card.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, symbol, value);
    }

    @Override
    public String toString() {
        return  "|" +
                 symbol +
                 suit +
                "|";

    }
}
