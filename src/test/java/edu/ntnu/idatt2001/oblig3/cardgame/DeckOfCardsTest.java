
package edu.ntnu.idatt2001.oblig3.cardgame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardsTest {

    @Test
    @DisplayName("Constructor is right size")
    void Constructor_Is_Right_Size() {
        //Arrange:
        //Act
        var deck = new DeckOfCards();
        //Assert
        assertEquals(52, deck.getDeck().size());
    }

    @Test
    @DisplayName("Constructor deck contains cards")
    void Constructor_Deck_Contains_Cards() {
        //Arrange:
        //Act
        var deck = new DeckOfCards();
        //Assert
        assertTrue(deck.getDeck().get(0) instanceof PlayingCard);
    }


    @Test
    @DisplayName("dealHand deals hand")
    void DealHand_Deals_Hand(){
        //Arrange:
        var deck = new DeckOfCards();
        //Act
        List<PlayingCard> hand = deck.dealHand(4);
        //Assert
        assertEquals(4, hand.size());
    }

    @Test
    @DisplayName("dealHand removes card from deck")
    void DealHand_Removes_Card_From_Deck(){
        //Arrange:
        var deck = new DeckOfCards();
        //Act
        List<PlayingCard> hand = deck.dealHand(4);
        //Assert
        assertEquals(48, deck.getDeck().size());
    }
}
