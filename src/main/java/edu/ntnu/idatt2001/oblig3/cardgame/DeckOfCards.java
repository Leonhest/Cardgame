package edu.ntnu.idatt2001.oblig3.cardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    private List<PlayingCard> deck;
    private final char[] suit = { 'S', 'H', 'D', 'C' };

    public DeckOfCards(){
        deck = new ArrayList<>();
        for(char i: suit){
            for(int j = 1; j <14; j++){
                deck.add(new PlayingCard(i,j));
            }
        }
    }

    public List<PlayingCard> dealHand(int n){
        List<PlayingCard> hand = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int randIndex = rand.nextInt(deck.size());

            hand.add(deck.get(randIndex));

            deck.remove(randIndex);
        }
        return hand;
    }

    public List<PlayingCard> getDeck() {
        return deck;
    }
}
