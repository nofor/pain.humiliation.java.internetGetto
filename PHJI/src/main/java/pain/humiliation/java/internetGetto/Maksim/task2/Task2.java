package pain.humiliation.java.internetGetto.Maksim.task2;

public class Task2 {

    public String divisionNumberWithRemainder(int q,int w){

        double division = 0;
        try {
            division = q / w;
        }
        catch (ArithmeticException e){
            System.out.println("Error!");
        }
        int remainder = q % w;

        return "Your example is -> " + q + "/" + w + "=" + (int)division + "\nRemainder is -> " + remainder;
    }

    public String sumNumberOfNumber(int a){
        int sum = 0;
        if((a <= 99 ) && ( a >= 10 )){
            int b = a / 10;
            int c = a % 10;
            sum = b + c;
        }
        else{
            System.out.println("Error!");
        }

        return "Your number is -> " + a + "\nSum numbers of number is -> " + sum;
    }

    public void ceilNumber(double num){
        int c = (int)num;
        if((num - c) >= 0.5){
            c = c + 1;
            System.out.println("Your number is -> " + num + "\nCeil -> " + c);
        }
        else {
            System.out.println("Your number is -> " + num + "\nCeil -> " + c);
        }
    }

    public String sumOfNumOfNumOfNum(int num){
        int firstNumber = num / 100;
        int secondNumber = (num % 100) / 10;
        int thirdNumber = num % 10;
        int sum = firstNumber + secondNumber + thirdNumber;

        return "Your number is -> " + num + "\nSum of numbers -> " + sum;
    }
}
