import java.util.Arrays;
import java.util.Random;

public class Card {
/* Card State -------------------------------------------------------------------------------------*/
    private Random random = new Random();
    private String[] suitRepresentation;

    private Suit suitFullName;
    private final String clubs = "\u2663";
    private final String hearts = "\u2665";
    private final String spades = "\u2660";
    private final String diamonds = "\u2666";

    private Integer numericValueController = 0;
    private String[] valueRepresentation = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public static void main(String[] args) {
        Card card = new Card();
        System.out.println(Arrays.toString(card.randomizeRepresentation(card)));
    }


/* Card Behavior  ---------------------------------------------------------------------------------------------------*/
    /** setRandomSuiteRepresentation(Card card)
     * Randomizes card suits; using The Fisher-Yates
     * shuffle algorithm. Time-complexity of O(n),
     * space-complexity of O(1).
     */ public String[] randomizeRepresentation(Card card) {
       String[] suitStamped = {
               card.getClubs(),
               getDiamonds(),
               getHearts(),
               getSpades()
       };
       setSuitRepresentation(suitStamped); //Initialized suit

       for (int i = getSuitRepresentation().length - 1; i >= 0; i--) { // 1.) Descending Order.
           int randomIndex = random.nextInt(i + 1); // 2.) Generate random number 0 - i inclusive.
           String randomSuit = getSuitRepresentation()[randomIndex]; // 3.) get String based on random index.
           getSuitRepresentation()[randomIndex] = getSuitRepresentation()[i]; // 4. swapped random string to ith index.
           getSuitRepresentation()[i] = randomSuit;// 5.) Place the suit that was originally at the ith position at the random index.
       }
        return suitRepresentation;
     }

    public void setSuitRepresentation(String[] suitRepresentation) {
        this.suitRepresentation = suitRepresentation;
    }

    /* Card Boiler-Plate-Code - getters & setters --------------------------------------------------------------------------------*/
    public Suit getSuit() {
        return suitFullName;
    }

    public String getClubs() {
        return clubs;
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


    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }


    public String[] getSuitRepresentation() {
        return suitRepresentation;
    }



    public Integer getNumericValueController() {
        return numericValueController;
    }

    public void setNumericValueController(Integer numericValueController) {
        this.numericValueController = numericValueController;
    }


    public String[] getValueRepresentation() {
        return valueRepresentation;
    }

    public void setValueRepresentation(String[] valueRepresentation) {
        this.valueRepresentation = valueRepresentation;
    }



}
