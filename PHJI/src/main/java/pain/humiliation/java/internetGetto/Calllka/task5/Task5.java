package pain.humiliation.java.internetGetto.Calllka.task5;

//TODO try to name methods by they logic DONE

public class Task5 {

    public int zeroElementCount(int[] massInteger) {
        int zeroCount = 0;

        for (int temp : massInteger) {
            if (temp == 0) zeroCount++;
        }

        return zeroCount;
    }

    public int maxElementInArray(int[] massInteger) {
        int c = massInteger[0];

        for (int temp : massInteger) {
            if (c < temp) c = temp;
        }

        return c;
    }

    public int searchElementInArray(int[] massInteger, int digit) {
        int count = 0;

        for (int i = 0; i < massInteger.length; i++) {
            if (digit == massInteger[i]) {
                count = i;
                break;
            }
        }

        return count;
    }

    public int maxElementCount(int[] massInteger) {
        int temp = massInteger[0];
        int count = 0;

        for (int digit : massInteger) {
            if (digit > temp) {
                temp = digit;
                count = 1;
            } else if (digit == temp) {
                count++;
            }
        }

        return count;
    }

    public void invertsArray(int[] massInteger) {
        int[] massDigit = new int[massInteger.length];

        for (int mass : massInteger) {
            System.out.print(mass);
        }

        System.out.print(" / ");

        for (int i = massInteger.length - 1, j = 0; i >= 0; i--, j++) {
            int temp = massInteger[i];
            massInteger[i] = massDigit[j];
            massDigit[j] = temp;
        }

        for (int mass : massDigit) {
            System.out.print(mass);
        } //todo remove DONE
    }

    public void sortingArray(int[] massInteger) { //todo remove extra line DONE
        for (int mass : massInteger) {
            System.out.print(mass);
        }

        System.out.print(" / ");

        for (int i = massInteger.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massInteger[j] > massInteger[j + 1]) {
                    int temp = massInteger[j];
                    massInteger[j] = massInteger[j + 1];
                    massInteger[j + 1] = temp;
                }
            }
        }

        for (int mass : massInteger) {
            System.out.print(mass);
        }
    }

    public boolean isWordPolindrome(String word) {
        boolean flag = false;
        char[] c = word.toCharArray();

        for (int i = c.length - 1, j = 0; i >= 0; i--, j++) {
            flag = c[i] == c[j];
        }

        return flag;
    }

    public void shiftsTheElementsOnOnePosition(int[] massInteger) {//todo remove extra line DONE
        for (int i = 0; i < 1; i++) {
            int temp = massInteger[massInteger.length - 1];
            for (int j = massInteger.length - 1; j > 0; j--) {
                massInteger[j] = massInteger[j - 1];
            }
            massInteger[0] = temp;
        }

        outputArray(massInteger);  //todo make separate method todo remove extra line DONE
    }

    public void shiftsTheElementsOnKPosition(int[] massInteger, int possition) {//todo remove sout DONE
        for (int i = 0; i < possition; i++) {
            int temp = massInteger[massInteger.length - 1];
            for (int j = massInteger.length - 1; j > 0; j--) {
                massInteger[j] = massInteger[j - 1];
            }
            massInteger[0] = temp;
        }

        outputArray(massInteger);  //todo make separate method todo remove extra line DONE
    }

    public void changeArrayElementsOnHalfsum(int[] massInteger) { //todo remove sout DONE
        for (int i = 1; i < massInteger.length - 1; i++) {
            massInteger[i] = (massInteger[i - 1] + massInteger[i + 1]) / 2;
        }

        outputArray(massInteger);  //todo make separate method todo remove extra line DONE
    }

    public void outputDifferenceTwoArray() {
        double[] firstMassiveDouble = new double[9];
        double[] secondMassiveDouble = new double[9];
        double[] resultMassive = new double[firstMassiveDouble.length];//todo remove sout DONE

        for (int i = 0; i < firstMassiveDouble.length; i++) {
            firstMassiveDouble[i] = Math.round((Math.random() * 9));
            secondMassiveDouble[i] = Math.round((Math.random() * 9));
            resultMassive[i] = firstMassiveDouble[i] - secondMassiveDouble[i];
        }

        outputDoubleArray(resultMassive);
    }

    public void unionOfSets() {
        int[] firstMassiveDouble = new int[9];
        int[] secondMassiveDouble = new int[9];
        int[] resultMassive = new int[firstMassiveDouble.length + secondMassiveDouble.length];

        for (int i = 0; i < firstMassiveDouble.length; i++) {
            firstMassiveDouble[i] = (int) Math.round((Math.random() * 9));
            secondMassiveDouble[i] = (int) Math.round((Math.random() * 9));
            resultMassive[i] = firstMassiveDouble[i];
            resultMassive[firstMassiveDouble.length + i] = secondMassiveDouble[i];
        }

        outputArray(resultMassive);
    }

    public void intersectionOfSets() {
        int[] firstMassiveDouble = new int[9];
        int[] secondMassiveDouble = new int[9];
        int[] resultMassive;
        int resultMassiveLength = 0, count = 0;

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

        outputArray(resultMassive);
    }

    public void differenceOfSets() {
        int[] firstMassiveDouble = new int[9];
        int[] secondMassiveDouble = new int[9];
        int[] resultMassive;
        int resultMassiveLength = 0, count = 0;

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

        outputArray(resultMassive);
    }

    public void outputNaturalDigits(int position) {  //todo make it dynamic DONE
        int n = 0;
        int[] massInteger = new int[position];

        int count = 0;

        do{

            n++;
            if (n % 13 == 0 || n % 17 == 0) {
                massInteger[count] = n;
                count++;
            }
        } while (count != position);

        outputArray(massInteger);//todo remove extra line DONE
    }

    public int localMinimum(int[] massInteger) {
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

    private void outputArray(int[] massInteger) {
        for (int temp : massInteger) {
            System.out.print(temp + " ");
        }
    }

    private void outputDoubleArray(double[] massInteger) {
        for (double temp : massInteger) {
            System.out.print(temp + " ");
        }
    }
}
