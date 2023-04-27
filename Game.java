package space.kodirex.PokerHands;

import space.kodirex.PokerHands.card.Card;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Game {
    public static final int HAND_SIZE = 5;

    /**
     * Size of hand
     * returns a boolean
     * throws exception
     */
    public static boolean isFullHouse(Card[] hand) {
        validateHandSize(hand.length);

        var handDistribution = getCardDistribution(hand, Card::rank).values();

        for(Integer i : handDistribution) {
            if(i == 3 || i == 2) break;

            return false;
        }

        return true;
    }

    private static void validateHandSize(int length) {
    }

    
    public static boolean isFlush(Card[] hand) {
        validateHandSize(hand.length);

        var handDistribution = getCardDistribution(hand, Card::suit).values();


        return handDistribution.size() == 1;
    }


    public static boolean isThreeOfAKind(Card[] hand) {
        validateHandSize(hand.length);

        var handDistribution = getCardDistribution(hand, Card::rank).values();


        for(Integer i : handDistribution) {
            if(i == 3) return true;
        }

        return false;


    /**
     * Used a map
     * */

    private static <Type> Map<Type, Integer> getCardDistribution(Card[] hand, Function<Card, Type> distOf) {
        return Arrays.stream(hand)
                .collect(Collectors.groupingBy(distOf,Collectors.summingInt(card -> 1)));
    }


    private static void validateHandSize(int length) {
        if(length != 5)
            throw new IllegalArgumentException("Your hand size must be %d".formatted(HAND_SIZE));

    }
}