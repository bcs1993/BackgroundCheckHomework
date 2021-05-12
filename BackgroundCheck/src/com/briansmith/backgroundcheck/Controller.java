package com.briansmith.backgroundcheck;


import javafx.event.ActionEvent;

public class Controller {


    public void runBackgroundCheck(ActionEvent actionEvent) {
        KingCountyBackgroundCheck newCheck = new KingCountyBackgroundCheck();
        newCheck.run();
        DOJBackgroundCheck dojCheck = new DOJBackgroundCheck();
        dojCheck.start();
    }
}
