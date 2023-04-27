package space.kodirex.PokerHands.card;

public enum Rank {
    ONE("Ace", 13),
    TWO("Two", 1),
    THREE("Three", 2),
    FOUR("Four", 3),
    FIVE("Five", 4),
    SIX("Six", 5),
    SEVEN("Seven", 6),
    EIGHT("Eight", 7),
    NINE("Nine", 8),
    TEN("Ten", 9),
    ELEVEN("Jack", 10),
    TWELVE("Queen", 11),
    THIRTEEN("King", 12);

    private final String name;
    private final int value;

    Rank(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /**
     * override toString
     */
    @Override
    public String toString() {
        return name;
    }
}
