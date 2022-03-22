package edu.ntnu.idatt2001.oblig3.cardgame;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CardController {

    List<PlayingCard> hand = new ArrayList<>();

    @FXML
    TextArea handDisplay = new TextArea();

    @FXML
    TextArea facesSum = new TextArea();

    @FXML
    TextArea flush = new TextArea();

    @FXML
    TextArea heartCards = new TextArea();

    @FXML
    TextArea spadesQueen = new TextArea();

    @FXML
    public void dealHand(){

        DeckOfCards deck = new DeckOfCards();
        hand = deck.dealHand(5);

        StringBuilder text = new StringBuilder();
        for(PlayingCard i: hand) {
            text.append(i.getAsString() + " ");
            String textHand = text.toString();
            handDisplay.setText(textHand);
        }
    }

    @FXML
    public void checkHand() {
        int sum = hand.stream()
                .mapToInt(x -> x.getFace())
                .sum();
        facesSum.setText(Integer.toString(sum));

        List<PlayingCard> hearts = hand.stream().filter(str -> str.getSuit() == ('H')).collect(Collectors.toList());
        if(hearts.isEmpty()) heartCards.setText("No Hearts");
        else{
        StringBuilder text = new StringBuilder();
        for(PlayingCard i: hearts) {
            text.append(i.getAsString() + " ");
            String textHand = text.toString();
            heartCards.setText(textHand);
        }

        boolean queen = hand.stream().anyMatch(str -> str.getAsString().equals("S11"));
        if(queen) spadesQueen.setText("Yes");
        else spadesQueen.setText("No");


        boolean cardFlush = hand.stream().allMatch(str -> str.getSuit() == (hand.get(0).getSuit()));
        if(cardFlush) flush.setText("Yes");
        else flush.setText("No");

        }
    }
}
