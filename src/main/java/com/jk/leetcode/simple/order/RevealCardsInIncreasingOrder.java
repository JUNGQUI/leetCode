package com.jk.leetcode.simple.order;

import java.util.Arrays;

public class RevealCardsInIncreasingOrder {

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] newDeck = new int[] {deck[deck.length-1]};

        for (int i = deck.length-2; i >= 0; i--) {
            newDeck = reorder(newDeck);
            int[] addDeck = new int[newDeck.length+1];
            addDeck[0] = deck[i];
            System.arraycopy(newDeck, 0, addDeck, 1, newDeck.length);
            newDeck = addDeck;
        }

        return newDeck;
    }

    public int[] reorder(int[] tempDeck) {
        int[] reorderDeck = new int[tempDeck.length];

        for (int i = 1; i < tempDeck.length; i++) {
            reorderDeck[i] = tempDeck[i-1];
        }

        reorderDeck[0] = tempDeck[tempDeck.length-1];

        return reorderDeck;
    }
}
