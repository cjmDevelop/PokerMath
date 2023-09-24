import java.util.Arrays;

public class Application {

    static String[] suits = {" \u2665", " \u2660", " \u2666", " \u2663"};
    static String [] representation  = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    static Integer value = 0;

    static Card[] suitOfThirteen = new Card[13];
    static Card[][] fullPackOrdered = new Card[4][13];



    public static void main(String[] args) {
        getFullNonShuffledDeckTest();
    }


    static void getFullNonShuffledDeckTest() {
        for (int j = 0; j < suits.length; j++) {
            String suit = suits[j];
            for (int i = 0; i < 13; i++) {
                value = (i + 1) + 1;
                System.out.println();
                   Card card = new Card(value, suit, representation[i]);
                suitOfThirteen[i] = card;
                    fullPackOrdered[j][i] = card;
            }

        }
        System.out.println("Un-shuffled: ");
        for (Card[] c: fullPackOrdered
        ) {
            System.out.println(Arrays.deepToString(c));
        }
    }

}


