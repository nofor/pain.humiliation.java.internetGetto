package pain.humiliation.java.internetGetto.Pbahher.task1;

public class Task1 {

    public void FirstTask() {
        for (int i = 0; i <= 10; i++) {

            System.out.print(i + " ");
        }
    }

    public void DelenieOstatok() {
        int q = 21;
        int w = 8;

        System.out.println("21 / 8 = " + q/w + ", Остаток " + q%w);
    }

    public void SummaDvuhChisel() {
        int a = 24;
        int b = a%10;
        int c = (a/10)%10;

        System.out.println("Сумма цифр числа " + a + " равна " + (b+c));
    }

    public void Okruglenie() {
        double n = 2.8;
        int c = (int) (0.5 + n);

        System.out.println(c);
    }

    public void SummaTrehChisel() {
        int a = 243;
        int b = a%10;
        int c = (a/10)%10;
        int d = ((a/10)/10)%10;

        System.out.println("Сумма цифр числа " + a + " равна " + (b+c+d));
    }

}