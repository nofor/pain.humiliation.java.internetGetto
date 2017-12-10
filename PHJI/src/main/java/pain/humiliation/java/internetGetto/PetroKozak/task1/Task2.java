package pain.humiliation.java.internetGetto.PetroKozak.task1;


public class Task2 {
    public static void main (String [] args){
        countWithRest(21,8);
        countAmountOfFigures(123,3);
       roundTheDouble(3.7);

    }

    public static void countWithRest(int q,int w){

        System.out.println(q/w + " and " + q%w + " left");
    }

    public static void  countAmountOfFigures(int number, int numberOfFigures){

        int s = 0;
        for (int i = 0; i < numberOfFigures; i++) {

            s= s+ number % 10;
            number /= 10;
        }
        System.out.println("Amount of figures in the number is: " + s);

    }
    public static void roundTheDouble(double x){
        double y=(double)Math.round(x);
        System.out.println(" Not rounded number was "+ x +"\n Rounded number is " + y);
    }

}
