import java.util.Arrays;

public class Dealer {


    private Integer cardValue = 0;
    private Card[] suitOfThirteen = new Card[13];
    private Card[][] fiftyTwoUnShuffled = new Card[4][13];
    private String[] suitSymbol = {"♥", "♠", "♦", "♣"};
    private String[] valueRepresentation = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String hearts = "♥";
    private String spades =   "♠";
    private String diamonds = "♦";
    private String clubs = "♣";

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.getNewPack();
        dealer.showSuitOf(dealer.getDiamonds());
    }

    public Card[][] getNewPack() {
        for (int j = 0; j < suitSymbol.length; j++) {
            String suit = suitSymbol[j];
            for (int i = 0; i < 13; i++) {
                cardValue = (i + 1) + 1;
                Card card = new Card(cardValue, suit, valueRepresentation[i]);
                fiftyTwoUnShuffled[j][i] = card;
            }
        }
        return fiftyTwoUnShuffled;
    }

    public void showPack() {
        for (Card[] c: this.fiftyTwoUnShuffled) {
            System.out.println(Arrays.deepToString(c));
        }
    }

    public void showSuitOf(String suit) {
        for (int i = 0; i < this.fiftyTwoUnShuffled.length; i++) {
            for(int j = 0; j < this.fiftyTwoUnShuffled[0].length; j++){
                if(this.fiftyTwoUnShuffled[i][j].getSuitRepresentation().equals(suit)) {
                    System.out.print(this.fiftyTwoUnShuffled[i][j]);
                }
            }
        }
    }

    public String getHearts() {
        return hearts;
    }

    public String getSpades() {
        return spades;
    }

    public String getDiamonds() {
        return diamonds;
    }

    public String getClubs() {
        return clubs;
    }
}










