package com.company;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Anton on 30.01.2017.
 */
public class arvutamineYksPaev {

        private GridPane aken2 = new GridPane(); //setka gridpane

        private Scene scene2 = new Scene(aken2,700,700);
        VBox jaakK = new VBox();
        VBox hind = new VBox();


    public arvutamineYksPaev(TextField vsaadetusKaup, TextField araostatudKaup, TextField toodeHind) {


            startStage();
            seadistaText();

            double vsKaup = Double.parseDouble(vsaadetusKaup.getText());
            double araKaup = Double.parseDouble(araostatudKaup.getText());
            double tH = Double.parseDouble(toodeHind.getText());

            double kuiPaljuJaak = vsKaup - araKaup;
            double rahaMügiEest = araKaup*tH; // saime raha müügi eest
            double kasum = rahaMügiEest-(2*araKaup);

            Label jaak = new Label(Double.toString(kuiPaljuJaak));
            jaakK.getChildren().addAll(jaak);

            Label kasum2 = new Label(Double.toString(kasum));
            hind.getChildren().addAll(kasum2);


        }

    private void seadistaText() {
        Text jaak = new Text("Kauba Jääk");
        Text Kasum = new Text("Kasum täna");

        jaak.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        aken2.add(jaak, 0, 0);
        aken2.setHalignment(jaak, HPos.CENTER);
        aken2.setMargin(jaak, new Insets(12,12,12,12));
        Kasum.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        aken2.add(Kasum, 1, 0);
        aken2.setHalignment(Kasum, HPos.CENTER);
        aken2.setMargin(Kasum, new Insets(12,12,12,12));
    }


    private void startStage() {
        Stage stage = new Stage();
        stage.setTitle("Fishfarm Calculator!");
        scene2.setFill(Color.GRAY);
        stage.setScene(scene2);
        stage.show();
        aken2.setGridLinesVisible(true); // показывает сетку gridpane
        aken2.setVgap(0); // отступы между границами сетки, делает пустые места по вертикали
        aken2.setHgap(0); // от делает пустые места по горизонтали
        aken2.setAlignment(Pos.CENTER); // delaet gridpane po zentru. ткперь не работает из за скролпане
        aken2.add(jaakK, 0, 1); //dobavili VBox v gridpane
        aken2.add(hind, 1, 1);
        aken2.setPadding(new Insets(25, 25, 25, 25)); // otstupi gridpane ot krajov
    }
}

