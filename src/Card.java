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
        String[] suits = card.randomizeRepresentation(card);
        card.seeRandomRepresentations(suits);

    }


    /* Card Behavior  ---------------------------------------------------------------------------------------------------*/

    /**
     * setRandomSuiteRepresentation(Card card)
     * Randomizes card suits; using The Fisher-Yates
     * shuffle algorithm. Time-complexity of O(n),
     * space-complexity of O(1).
     */
    public String[] randomizeRepresentation(Card card) {
        String[] suitStamped = {
                card.getClubs(),
                getDiamonds(),
                getHearts(),
                getSpades()
        };
        setSuitRepresentation(suitStamped);

        for (int i = getSuitRepresentation().length - 1; i >= 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            String randomSuit = getSuitRepresentation()[randomIndex];
            getSuitRepresentation()[randomIndex] = getSuitRepresentation()[i];
            getSuitRepresentation()[i] = randomSuit;
        }
        return suitRepresentation;
    }

    void seeRandomRepresentations(String[] suits) {
        for (String suit : suits) {
            System.out.print("                 " + " | " + suit + " | ");
            try {
                Thread.sleep(750);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        present();
    }


     void present() {
         int dial = 2;
         System.out.println(" ");
         String[] presentedBy = {"cjmDevelops", "TEXAS HOLD'EM", "POKER MATH"};
         for(String s : presentedBy){
             if(s.equals("cjmDevelops")) {
              System.out.print("                                                    " + s + "\n");
                 try {
                     Thread.sleep(553 * dial);
                     dial++;
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             }
             else if(s.equals("TEXAS HOLD'EM")) {
                 System.out.print("                                                   " + s + "\n");
                 try {
                     Thread.sleep(553 * dial);
                     dial++;
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             }else {
                 System.out.print("                                                     " + s + "\n");
                 try {
                     Thread.sleep(553 * dial);
                     dial++;
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             }

         }
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

    public void setSuitRepresentation(String[] suitRepresentation) {
        this.suitRepresentation = suitRepresentation;
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
