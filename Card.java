/**
 *Ranks the suit of the card and face value.
 */
public record Card(space.kodirex.PokerHands.card.Rank rank, space.kodirex.PokerHands.card.Suit suit) {


    @Override
    public String toString() {
        return "%s of %s".formatted(rank, suit);
    }
}
