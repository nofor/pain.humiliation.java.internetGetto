package pain.humiliation.java.internetGetto.Calllka.task5;

public class Task5Part2 {

    public void homework11() {
        double[] firstMassiveDouble = new double[9];
        double[] secondMassiveDouble = new double[9];
        double[] resultMassive = new double[firstMassiveDouble.length];
        System.out.println();

        for (int i = 0; i < firstMassiveDouble.length; i++) {
            firstMassiveDouble[i] = Math.round((Math.random() * 9));
            secondMassiveDouble[i] = Math.round((Math.random() * 9));
            resultMassive[i] = firstMassiveDouble[i] - secondMassiveDouble[i];
        }

        for (double temp : resultMassive) {
            System.out.print(temp + " ");
        }
    }

    public void homework12() {
        int[] firstMassiveDouble = new int[9];
        int[] secondMassiveDouble = new int[9];
        int[] resultMassive = new int[firstMassiveDouble.length + secondMassiveDouble.length];
        System.out.println("Homework 12");

        for (int i = 0; i < firstMassiveDouble.length; i++) {
            firstMassiveDouble[i] = (int) Math.round((Math.random() * 9));
            secondMassiveDouble[i] = (int) Math.round((Math.random() * 9));
            resultMassive[i] = firstMassiveDouble[i];
            resultMassive[firstMassiveDouble.length + i] = secondMassiveDouble[i];
        }

        for (int temp : resultMassive) {
            System.out.print(temp + " ");
        }
    }

    public void homework13() {
        int[] firstMassiveDouble = new int[9];
        int[] secondMassiveDouble = new int[9];
        int[] resultMassive;
        int resultMassiveLength = 0, count = 0;
        System.out.println("Homework 13");

        for (int i = 0; i < firstMassiveDouble.length; i++) {
            firstMassiveDouble[i] = (int) Math.round((Math.random() * 9));
            secondMassiveDouble[i] = (int) Math.round((Math.random() * 9));

            if (firstMassiveDouble[i] == secondMassiveDouble[i]) {
                count++;
            }
        }

        resultMassive = new int[count];

        for (int i = 0; i < firstMassiveDouble.length; i++) {
            if (firstMassiveDouble[i] == secondMassiveDouble[i]) {
                resultMassive[resultMassiveLength] = firstMassiveDouble[i];
                resultMassiveLength++;
            }
        }

        for (int temp : resultMassive) {
            System.out.print(temp + " ");
        }
    }

    public void homework14() {
        int[] firstMassiveDouble = new int[9];
        int[] secondMassiveDouble = new int[9];
        int[] resultMassive;
        int resultMassiveLength = 0, count = 0;
        System.out.println("Homework 14");

        for (int i = 0; i < firstMassiveDouble.length; i++) {
            firstMassiveDouble[i] = (int) Math.round((Math.random() * 9));
            secondMassiveDouble[i] = (int) Math.round((Math.random() * 9));

            if (firstMassiveDouble[i] != secondMassiveDouble[i]) {
                count = count + 2;
            }
        }

        resultMassive = new int[count];

        for (int i = 0; i < firstMassiveDouble.length; i++) {
            if (firstMassiveDouble[i] != secondMassiveDouble[i]) {
                resultMassive[resultMassiveLength] = firstMassiveDouble[i];
                resultMassive[resultMassiveLength + 1] = secondMassiveDouble[i];
                resultMassiveLength = resultMassiveLength + 2;
            }
        }

        for (int temp : resultMassive) {
            System.out.print(temp + " ");
        }
    }

    public void homework15() {
        int n = 0;
        int[] massInteger = new int[100];

        for (int i = 1; n < 100; i++) {

            if (i % 13 == 0 || i % 17 == 0) {
                massInteger[n] = i;
                n++;
            }

        }

        for (int temp : massInteger) {
            System.out.print(temp + ",");
        }

        System.out.println();

    }

    public int homework16(int[] massInteger) {
        int count = 0;

        for (int i = 0; i < massInteger.length; i++) {
            if (i == 0) {
                if (massInteger[i] > massInteger[i + 1]) {
                    count++;
                }
            } else if (i == massInteger.length - 1) {
                if (massInteger[i] > massInteger[i - 1]) {
                    count++;
                }
            } else {
                if (massInteger[i] > massInteger[i - 1] && massInteger[i] > massInteger[i + 1]) {
                    count++;
                }
            }
        }

        return count;
    }
}
