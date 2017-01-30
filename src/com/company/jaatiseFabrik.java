package com.company;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Anton on 30.01.2017.
 */
public class jaatiseFabrik {
    private GridPane aken1 = new GridPane();
    private Scene scene1 = new Scene(aken1, 700, 700);
    Button Nupp1 = new Button("Arvuta ühepäeva jaoks!");
    TextField vsaadetusKaup = new TextField();
    TextField araostatudKaup = new TextField();
    TextField toodeHind = new TextField();
    Text valjaKaup = new Text("Välja saadetuds kaup: ");
    Text ostetudKaup = new Text("Ära ostetud kaup: ");
    Text hind = new Text("Hind täna: ");
    Button Nupp2 = new Button("Salvesta sisestatud andmed");

    public jaatiseFabrik (){
        seadistaTextField();
        seadistaText();
        seadistaNuppud();
        startStage();
        seadistaArutamine();
        seadistaAndmeteSalvestamine();



    }

    private void seadistaAndmeteSalvestamine() {
        Nupp2.setOnAction(arg0 -> new arvutamineMituPaevad(vsaadetusKaup, araostatudKaup, toodeHind));
    }

    private void seadistaArutamine() {
        Nupp1.setOnAction(arg0 -> new arvutamineYksPaev(vsaadetusKaup, araostatudKaup, toodeHind));
    }


    private void seadistaNuppud() {
        aken1.add(Nupp1, 1, 4);
        aken1.setMargin(Nupp1, new Insets(0,10,0,10));
        aken1.add(Nupp2, 1, 5);
        aken1.setMargin(Nupp2, new Insets(0,10,0,10));


    }

    private void seadistaText() {
        valjaKaup.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        aken1.add(valjaKaup, 0, 1);

        ostetudKaup.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        aken1.add(ostetudKaup, 0, 2);

        hind.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        aken1.add(hind, 0, 3);


    }

    private void seadistaTextField() {
        aken1.add(vsaadetusKaup, 1,1);
        vsaadetusKaup.setPromptText("Välja saadetud kaup");
        aken1.setMargin(vsaadetusKaup, new Insets(10,10,10,10));

        aken1.add(araostatudKaup, 1,2);
        araostatudKaup.setPromptText("Kui palju tooded oli statud");
        aken1.setMargin(araostatudKaup, new Insets(10,10,10,10));

        aken1.add(toodeHind, 1,3);
        toodeHind.setPromptText("Toode hind täna");
        aken1.setMargin(toodeHind, new Insets(10,10,10,10));

    }

    private void startStage() {
        Stage stage = new Stage();
        stage.setTitle("Jäätise fabrik");
        scene1.setFill(Color.GRAY);
        stage.setScene(scene1);
        stage.show();
        //aken1.setGridLinesVisible(true); // показывает сетку гридпейн
        aken1.setVgap(15);
        aken1.setHgap(12);
        aken1.setAlignment(Pos.CENTER);
    }
}

