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

    // у меня тут была идея такая что я нажимаю кнопку посчитать для нескольких дней и он каждый раз увеличивает остаток
        // jaakSum и увеличивает прибыль kasumSuma как я понимаю каждое нажатие кнопки должно делать увеличение дня и считать новые данные\
        //на новый день то есть прибыль прошлого дня плюч прибыль нового дня в итоге выдавать это вместе но и сохранять хашмап отдельные дни.
        //и хашмап выдавать все дни по потдельности. чтоб потом я от туда мог брать данные и анализировать его... там попалить когда больше была
        //была прибыль, сумму там посчитать и тд... тут у меня при нажатие кнопки день всегда 1. короче надо наверно просто через скайп когда ты
        //сможешь.



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
