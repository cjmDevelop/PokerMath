import java.util.Arrays;

public class Application {

//    static String suit = null;
    static String[] suits = {" \u2665", " \u2660", " \u2666", " \u2663"};

    static Integer value = 0;
//    static String valueRepresentation = null;

    static Card[] cards = new Card[13];
    static Card[][] pack = new Card[4][13];

//    static int dial = 0;

    public static void main(String[] args) {
        getFullNonShuffledDeckTest();
    }

    static void getFullNonShuffledDeckTest() {
        for (int j = 0; j < suits.length; j++) {
            String suit = suits[j];
            for (int i = 0; i < 13; i++) {
                value = i + 1;
                Card card = new Card(value, suit);
                cards[i] = card;
                    pack[j][i] = card;
            }

        }
        for (Card[] c: pack
        ) {
            System.out.println(Arrays.deepToString(c));
        }
    }

}


