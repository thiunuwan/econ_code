package sample;

import javafx.event.ActionEvent;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {


    public LineChart lineChartA;
    public LineChart lineChartB;

    public TextField TUa1, TUa2, TUa3, TUa4, TUa5, TUa6, TUa7, TUa8, TUa9, TUa10, MUa1, MUa2, MUa3, MUa4, MUa5,
            MUa6, MUa7, MUa8, MUa9, MUa10, TUb1, TUb2, TUb3, TUb4, TUb5, TUb6, TUb7, TUb8, TUb9, TUb10, MUb1, MUb2,
            MUb3, MUb4, MUb5, MUb6, MUb7, MUb8, MUb9, MUb10, kA1, kA2, kA3, kA4, kA5, kB1, kB2, kB3, kB4, kB5, kA6,
            kA7, kA8, kA9, kA10, kB6, kB7, kB8, kB9, kB10;

    public TextField priceA, priceB, budget;
    public int[] TUa = new int[10];
    public int[] TUb = new int[10];
    public double[] kA = new double[10];
    public double[] kB = new double[10];
    public TextField N;
    public Text unitsA,unitsB;
    int units;
    double priceAN,priceBN,budgetN;
    public void getData(ActionEvent actionEvent) {
        priceAN = Double.parseDouble(priceA.getText());
        priceBN = Double.parseDouble(priceB.getText());
        budgetN = Double.parseDouble(budget.getText());
        units = Integer.parseInt(N.getText());

                TUa[0] = Integer.parseInt(TUa1.getText());
                TUa[1] = Integer.parseInt(TUa2.getText());
                TUa[2] = Integer.parseInt(TUa3.getText());
                TUb[0] = Integer.parseInt(TUb1.getText());
                TUb[1] = Integer.parseInt(TUb2.getText());
                TUb[2] = Integer.parseInt(TUb3.getText());
                MUa1.setText("" + TUa[0]);
                MUb1.setText("" + TUb[0]);

                MUa2.setText("" + (TUa[1] - TUa[0]));
                MUb2.setText("" + (TUb[1] - TUb[0]));

                MUa3.setText("" + (TUa[2] - TUa[1]));
                MUb3.setText("" + (TUb[2] - TUb[1]));

                if(units>3)
        {    TUa[3] = Integer.parseInt(TUa4.getText());
            TUb[3] = Integer.parseInt(TUb4.getText());

            MUa4.setText("" + (TUa[3] - TUa[2]));
            MUb4.setText("" + (TUb[3] - TUb[2]));

        }
        if(units>4)
        {     TUa[4] = Integer.parseInt(TUa5.getText());
            TUb[4] = Integer.parseInt(TUb5.getText());

            MUa5.setText("" + (TUa[4] - TUa[3]));
            MUb5.setText("" + (TUb[4] - TUb[3]));

        }
        if(units>5)
        {      TUa[5] = Integer.parseInt(TUa6.getText());
            TUb[5] = Integer.parseInt(TUb6.getText());

            MUa6.setText("" + (TUa[5] - TUa[4]));
            MUb6.setText("" + (TUb[5] - TUb[4]));
        }
        if(units>6)
        {      TUa[6] = Integer.parseInt(TUa7.getText());
            TUb[6] = Integer.parseInt(TUb7.getText());
            MUa7.setText("" + (TUa[6] - TUa[5]));
            MUb7.setText("" + (TUb[6] - TUb[5]));

        }
        if(units>7)
        {        TUa[7] = Integer.parseInt(TUa8.getText());
            TUb[7] = Integer.parseInt(TUb8.getText());
            MUa8.setText("" + (TUa[7] - TUa[6]));
            MUb8.setText("" + (TUb[7] - TUb[6]));

        }
        if(units>8)
        {
            TUa[8] = Integer.parseInt(TUa9.getText());
            TUb[8] = Integer.parseInt(TUb9.getText());
            MUa9.setText("" + (TUa[8] - TUa[7]));
            MUb9.setText("" + (TUb[8] - TUb[7]));
        } if(units>9)
        {
            TUa[9] = Integer.parseInt(TUa10.getText());
            TUb[9] = Integer.parseInt(TUb10.getText());
            MUa10.setText("" + (TUa[9] - TUa[8]));
            MUb10.setText("" + (TUb[9] - TUb[8]));
        }
    }

    public void calculate(ActionEvent actionEvent) {

        kA[0] = (TUa[0] / priceAN);
        kB[0] = TUb[0] / priceBN;
        for (int i = 1; i < units; i++) {
            kA[i] = (TUa[i] - TUa[i - 1]) / priceAN;
            kB[i] = (TUb[i] - TUb[i - 1]) / priceBN;
        }

        kA1.setText("" + kA[0]);
        kB1.setText("" + kB[0]);

        kA2.setText("" + kA[1]);
        kB2.setText("" + kB[1]);

        kA3.setText("" + kA[2]);
        kB3.setText("" + kB[2]);

        if(units>3)
        {        kA4.setText("" + kA[3]);
            kB4.setText("" + kB[3]);


        }
        if(units>4)
        {
            kA5.setText("" + kA[4]);
            kB5.setText("" + kB[4]);

        }
        if(units>5)
        {     kA6.setText("" + kA[5]);
            kB6.setText("" + kB[5]);

        }
        if(units>6)
        {         kA7.setText("" + kA[6]);
            kB7.setText("" + kB[6]);
        }
        if(units>7)
        {
            kA8.setText("" + kA[7]);
            kB8.setText("" + kB[7]);

        }
        if(units>8)
        {
            kA9.setText("" + kA[8]);
            kB9.setText("" + kB[8]);
        } if(units>9)
        {
            kA10.setText("" + kA[9]);
            kB10.setText("" + kB[9]);
        }

        for (int i = 0; i <units; i++) {
            for (int j = 0; j <units; j++) {
                if((kA[i]==kB[j]) && ((priceAN*(i+1)+priceBN*(j+1))==budgetN) )
                {
                    unitsA.setText(""+(i+1));
                    unitsB.setText(""+(j+1));
                    break;
                }
            }

        }


    }

    public void plotA(ActionEvent actionEvent) {
        plotGraphs(TUa,"Good A");

    }

    public void plotB(ActionEvent actionEvent) {
        plotGraphs(TUb,"Good B");
    }

    private void plotGraphs(int[] tUc,String k) {
        XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
        XYChart.Series<Number, Number> series2 = new XYChart.Series<>();

        for (int i = 0; i <units ; i++) {
            series1.getData().add(new XYChart.Data<>((i+1), tUc[i]));
        }

        series2.getData().add(new XYChart.Data<>((1), tUc[0]));
        for (int i = 1; i <units ; i++) {
            series2.getData().add(new XYChart.Data<>((i+1), tUc[i]- tUc[i-1]));
        }
        series1.setName(k);
        series2.setName(k);
        lineChartA.getData().add(series1);
        lineChartB.getData().add(series2);
    }

    public void clear(ActionEvent actionEvent) {
        lineChartA.getData().clear();
        lineChartB.getData().clear();
        priceA.clear();
        priceB.clear();
        budget.clear();
        N.clear();
        unitsA.setText("..");
        unitsB.setText("..");
        TUa1.clear(); TUb1.clear(); MUa1.clear(); MUb1.clear(); kA1.clear(); kB1.clear();
        TUa2.clear(); TUb2.clear(); MUa2.clear(); MUb2.clear(); kA2.clear(); kB2.clear();
        TUa3.clear(); TUb3.clear(); MUa3.clear(); MUb3.clear(); kA3.clear(); kB3.clear();
        TUa4.clear(); TUb4.clear(); MUa4.clear(); MUb4.clear(); kA4.clear(); kB4.clear();
        TUa5.clear(); TUb5.clear(); MUa5.clear(); MUb5.clear(); kA5.clear(); kB5.clear();
        TUa6.clear(); TUb6.clear(); MUa6.clear(); MUb6.clear(); kA6.clear(); kB6.clear();
        TUa7.clear(); TUb7.clear(); MUa7.clear(); MUb7.clear(); kA7.clear(); kB7.clear();
        TUa8.clear(); TUb8.clear(); MUa8.clear(); MUb8.clear(); kA8.clear(); kB8.clear();
        TUa9.clear(); TUb9.clear(); MUa9.clear(); MUb9.clear(); kA9.clear(); kB9.clear();
        TUa10.clear(); TUb10.clear(); MUa10.clear(); MUb10.clear(); kA10.clear(); kB10.clear();


    }
}









