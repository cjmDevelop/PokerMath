public class Scrap {

    public static void main(String[] args) {

        Card[] suits = new Card[13];
        Card[][] deck = new Card[suits.length -1][suits.length -1];

        String[] suitReps = { "\u2665", "\u2660", "\u2666", "\u2663" };

        String[] valReps = {"2", "3", "4", "5",
                            "6", "7", "8", "9",
                            "10", "J", "Q", "K",
                            "A"};

        Integer[] values = { 2, 3, 4, 5,
                             6, 7, 8, 9,
                            10, 11, 12, 13,
                            14 };

        for(int i = 0; i < suitReps.length -1; i++){
            for(int j = 0; j < valReps.length -1; j++){

            }
        }
    }

    public void getRandomSuit(){}
    public void getRandomSuitOfCards(){}

}
