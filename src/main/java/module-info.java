module cardgame {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.ntnu.idatt2001.oblig3.cardgame to javafx.fxml;
    exports edu.ntnu.idatt2001.oblig3.cardgame;
}