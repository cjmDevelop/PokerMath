import java.util.Objects;

public class Card {

    private String suitRepresentation;
    private String valueRepresentation;
    private Integer value;


    public Card() {
    }

    public Card(Integer value, String suitRepresentation) {
        this.suitRepresentation = suitRepresentation;
        this.value = value;
    }

    public Card(String suitRepresentation, String valueRepresentation, Integer value) {
        this.suitRepresentation = suitRepresentation;
        this.valueRepresentation = valueRepresentation;
        this.value= value;
    }

    public Card(Integer value, String suitRepresentation, String valueRepresentation) {
        this.suitRepresentation = suitRepresentation;
        this.valueRepresentation = valueRepresentation;
        this.value= value;
    }

    public String getSuitRepresentation() {
        return suitRepresentation;
    }

    public void setSuitRepresentation(String suitRepresentation) {
        this.suitRepresentation = suitRepresentation;
    }


    public void setValueRepresentation(String valueRepresentation) {
        this.valueRepresentation = valueRepresentation;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getValueRepresentation() {
        return valueRepresentation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(suitRepresentation, card.suitRepresentation) && Objects.equals(valueRepresentation, card.valueRepresentation) && Objects.equals(value, card.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suitRepresentation, valueRepresentation, value);
    }


    @Override
    public String toString() {
//    String adjustRepresentation = valueRepresentation.length() == 1 ? " " + valueRepresentation : valueRepresentation;

        return "|" +
                valueRepresentation + " " +
                suitRepresentation +
                " | ";
    }

}
