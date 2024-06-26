package abstraction.card;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    CardSuits(int suitPower) {
        this.suitPower = suitPower;
    }

    private int suitPower;

    public int getSuitPower() {
        return suitPower;
    }
}