package edu.ntnu.idatt2001.oblig3.cardgame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCardTest {

    @Test
    @DisplayName("Constructor initializes correctly")
    void Constructor_Initializes_Correctly() {
        //Arrange:
        char suit = 'S';
        int face = 12;
        //Act
        var card = new PlayingCard(suit,face);
        //Assert
        assertEquals(suit, card.getSuit());
        assertEquals(face, card.getFace());
    }

}