package edu.ntnu.idatt2001.oblig3.cardgame;

import java.util.ArrayList;
import java.util.List;

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


}
