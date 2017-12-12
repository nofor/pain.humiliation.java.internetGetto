package pain.humiliation.java.internetGetto.PetroKozak.task1;


public class Task2 {


    public String countWithRest(int q, int w) {
        return q / w + " and " + q % w + " left";
    }

    public String countAmountOfFigures(int number, int numberOfFigures) {
        int s = 0;

        for (int i = 0; i < numberOfFigures; i++) {
            s = s + number % 10;
            number = number / 10;
        }


        return "Amount of figures in the number is: " + s;
    }

    public String roundTheDouble(double x) {
        double y = (double) Math.round(x);
        return " Not rounded number was " + x + "\n Rounded number is " + y;
    }

}
