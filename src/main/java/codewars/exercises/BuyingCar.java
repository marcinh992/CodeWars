package codewars.exercises;

//Let us begin with an example:
//
//A man has a rather old car being worth $2000.
// He saw a secondhand car being worth $8000. He wants to keep his old car until he can buy the secondhand one.

//He thinks he can save $1000 each month but the prices of his old car and of the new one decrease of 1.5
// percent per month. Furthermore this percent of loss increases of 0.5 percent at the end of every two months.
// Our man finds it difficult to make all these calculations.
//
//Can you help him?


public class BuyingCar {
    public static void main(String[] args) {

        double presentCarValue = 2000;
        double dreamCarValue = 8000;
        double moneySavedPerMonth = 1000;

        int month = savingCalculator(presentCarValue, dreamCarValue, moneySavedPerMonth);
        System.out.println(month);
    }

    public static int savingCalculator(double presentCarValue, double dreamCarValue, double moneySavedPerMonth) {
        double percentageValue = 1.5;
        double saving = 0;
        int month = 0;
        int mothAfterDecreaseCarsValue = 0;

        while ((saving + presentCarValue) < dreamCarValue) {
            saving = saving + moneySavedPerMonth;
            double valueLosePerMothForPresentCar = (presentCarValue * percentageValue / 100);
            double valueLosePerMothForDreamCar = (dreamCarValue * percentageValue / 100);
            presentCarValue = presentCarValue - valueLosePerMothForPresentCar;
            dreamCarValue = dreamCarValue - valueLosePerMothForDreamCar;
            mothAfterDecreaseCarsValue++;
            if (mothAfterDecreaseCarsValue == 2) {
                percentageValue = percentageValue + 0.5;
                mothAfterDecreaseCarsValue = 0;
            }
            month++;
        }
        return month;
    }


    //notsy

    // co miesiąc oszczędza 1000$
    // jego aktualne auto kosztuje 2000$
    // auto na które poluje kosztuje 8000$
    //wartość jego auta spada o 1,5% ponadto co 2msc procent ten wzrasta o 0,5
    //to samo tyczy się tego nowego auta

    //ile miesięcy zajmie mu odkładanie na nowy samochód?
}
