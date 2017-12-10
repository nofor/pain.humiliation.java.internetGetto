package pain.humiliation.java.internetGetto.Pbahher.task1;

public class Task1 {

    public void firstTask() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public void divisionRestNumber() {
        int q = 21;
        int w = 8;
        System.out.println("21 / 8 = " + q / w + ", rest " + q % w);
    }

    public void sumOfTwoNumbers() {
        int a = 24;
        int b = a % 10;
        int c = (a / 10) % 10;
        System.out.println("Sum of numbers " + a + " is " + (b + c));
    }

    public void roundingOfNumber() {
        double n = 2.8;
        int c = (int) (0.5 + n);
        System.out.println(c);
    }

    public void sumOfThreeNumbers() {
        int a = 243;
        int b = a % 10;
        int c = (a / 10) % 10;
        int d = ((a / 10) / 10) % 10;
        System.out.println("Sum of numbers " + a + " is " + (b + c + d));
    }

}