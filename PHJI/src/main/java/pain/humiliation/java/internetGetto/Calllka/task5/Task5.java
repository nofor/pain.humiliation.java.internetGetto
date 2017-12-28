package pain.humiliation.java.internetGetto.Calllka.task5;

//TODO try to name methods by they logic

public class Task5 {

    public int homework1(int[] massInteger) {
        int zeroCount = 0;

        for (int temp : massInteger) {
            if (temp == 0) zeroCount++;
        }

        return zeroCount;
    }

    public int homework2(int[] massInteger) {
        int c = massInteger[0];

        for (int temp : massInteger) {
            if (c < temp) c = temp;
        }

        return c;
    }

    public int homework3(int[] massInteger, int digit) {
        int count = 0;

        for (int i = 0; i < massInteger.length; i++) {
            if (digit == massInteger[i]) {
                count = i;
                break;
            }
        }

        return count;
    }

    public int homework4(int[] massInteger) {
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

    public void homework5(int[] massInteger) {
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
        }

        System.out.println();  //todo remove
    }

    public void homework6(int[] massInteger) {
        //todo remove extra line
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

    public boolean homework7(String word) {
        boolean flag = false;
        char[] c = word.toCharArray();

        for (int i = c.length - 1, j = 0; i >= 0; i--, j++) {
            flag = c[i] == c[j];
        }

        return flag;
    }

    public void homework8(int[] massInteger) {
        //todo remove extra line
        for (int i = 0; i < 1; i++) {
            int temp = massInteger[massInteger.length - 1];
            for (int j = massInteger.length - 1; j > 0; j--) {
                massInteger[j] = massInteger[j - 1];
            }
            massInteger[0] = temp;
        }

        for (int temp : massInteger) {  //todo make separate method
            System.out.print(temp);
        }
        //todo remove extra line
    }

    public void homework9(int[] massInteger, int possition) {
        System.out.println();  //todo remove

        for (int i = 0; i < possition; i++) {
            int temp = massInteger[massInteger.length - 1];
            for (int j = massInteger.length - 1; j > 0; j--) {
                massInteger[j] = massInteger[j - 1];
            }
            massInteger[0] = temp;
        }

        for (int temp : massInteger) {  //todo make separate method
            System.out.print(temp);
        }
        //todo remove extra line
    }

    public void homework10(int[] massInteger) {
        System.out.println();  //todo remove

        for (int i = 1; i < massInteger.length - 1; i++) {
            massInteger[i] = (massInteger[i - 1] + massInteger[i + 1]) / 2;
        }

        for (int temp : massInteger) {  //todo make separate method
            System.out.print(temp);
        }
        //todo remove extra line
    }

}
