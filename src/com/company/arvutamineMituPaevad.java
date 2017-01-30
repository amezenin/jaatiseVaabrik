package com.company;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.HashMap;

/**
 * Created by Anton on 30.01.2017.
 */
public class arvutamineMituPaevad {
    public arvutamineMituPaevad(TextField vsaadetusKaup, TextField araostatudKaup, TextField toodeHind) {
        HashMap<Double, Double> hmap = new HashMap<Double, Double>();





        int day = hmap.size();
        day++;
        double jaakSum = 0;
        double kasumSum =0;


        for (int i = 0; i < day;i++) {

            double vsKaup = Double.parseDouble(vsaadetusKaup.getText());
            double araKaup = Double.parseDouble(araostatudKaup.getText());
            double tH = Double.parseDouble(toodeHind.getText());
            double jaak = vsKaup-araKaup;
            double kasum = tH*araKaup-2*araKaup;



            jaakSum = jaak + jaakSum;
            kasumSum = kasum + kasumSum;
        }


            Text proov = new Text("Proov");
        hmap.put((double) day, jaakSum);
        System.out.println(day);
        System.out.println(jaakSum);
        System.out.println(hmap.values());

    }
}
