import java.util.Arrays;

public class Dealer {

    private String[] suits = {" \u2665", " \u2660", " \u2666", " \u2663"};
    private String [] representation  = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private Integer value = 0;

    private Card[] suitOfThirteen = new Card[13];
    private Card[][] fullPackUnShuffled = new Card[4][13];



    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.getUnShuffledCards();
        dealer.show();
    }


    public Card[][] getUnShuffledCards() {
        for (int j = 0; j < suits.length; j++) {
            String suit = suits[j];
            for (int i = 0; i < 13; i++) {
                value = (i + 1) + 1;
                System.out.println();
                   Card card = new Card(value, suit, representation[i]);
                suitOfThirteen[i] = card;
                    fullPackUnShuffled[j][i] = card;
            }
        }
        return fullPackUnShuffled;
    }

    public void show(){
        System.out.println("Un-shuffled: ");
        for (Card[] c: fullPackUnShuffled
        ) {
            System.out.println(Arrays.deepToString(c));
        }
    }


    public String[] getSuits() {
        return suits;
    }

    public void setSuits(String[] suits) {
        this.suits = suits;
    }

    public String[] getRepresentation() {
        return representation;
    }

    public void setRepresentation(String[] representation) {
        this.representation = representation;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Card[] getSuitOfThirteen() {
        return suitOfThirteen;
    }

    public void setSuitOfThirteen(Card[] suitOfThirteen) {
        this.suitOfThirteen = suitOfThirteen;
    }

    public Card[][] getFullPackUnShuffled() {
        return fullPackUnShuffled;
    }

    public void setFullPackUnShuffled(Card[][] fullPackUnShuffled) {
        this.fullPackUnShuffled = fullPackUnShuffled;
    }
}


