package pain.humiliation.java.internetGetto.PetroKozak.task5;

public class Task5 {

    public void printNullElements(int[] t1) {
        int count = 0;

        for (int y : t1) {
            if (t1[y] == 0)
                count++;
        }

        System.out.println(count);
    }

    public void printMaxElement(int[] t2) {
        boolean emptiness = false;

        if (t2.length == 0) emptiness = true;

        if (emptiness == true) {
            System.out.println("This array is empty");
        } else if (emptiness == false) {
            int max = 0;
            for (int y : t2) {
                if (max < y) {
                    max = y;
                }
            }

            System.out.println(max);
        }
    }

    public void printFirstInput(int[] t3, int x) {
        for (int i = 0; i < t3.length; i++) {
            if (t3[i] == x) {
                System.out.println(i);
                break;
            }
        }
    }

    public void printAmountOfMaxElements(int[] t4) {
        int max = t4[0];
        int count = 0;

        for (int i : t4) {
            if (max < i) {
                max = i;
                count = 1;
            } else if (max == i) {
                count++;
            }
        }

        System.out.println(count);
    }

    public void reverseArray(int[] t5) {
        for (int i = t5.length - 1; i >= 0; i--) {
            System.out.print(t5[i]);
        }
    }

    public void sortArray(int[] t6) {
        int length = t6.length;
        for (int c : t6) {
            for (int j = 0; j < length - 1; j++) {
                if (t6[j] > t6[j + 1]) {
                    int temp = t6[j];
                    t6[j] = t6[j + 1];
                    t6[j + 1] = temp;
                }
            }
        }

        for (int x : t6) {
            System.out.print(x);
        }
    }

    public void checkIfPalindrome(int[] t) {
        boolean match = false;

        for (int i = 0; i < t.length / 2; i++) {
            if (t[i] == t[t.length - i - 1]) {
                match = true;
            } else {
                match = false;
            }
        }

        System.out.println(match);
    }

    public void moveElementOn1Pos(int[] t8) {
        for (int j = 0; j < 1; j++) {
            int firstEl = t8[t8.length - 1];
            for (int i = t8.length - 1; i > 0; i--) {
                t8[i] = t8[i - 1];
            }
            t8[0] = firstEl;
        }

        for (int f : t8) {
            System.out.print(f);
        }
    }

    public void moveOnXElemets(int[] t9, int movingNumber) {
        for (int j = 0; j < movingNumber; j++) {
            int firstEl = t9[t9.length - 1];
            for (int i = t9.length - 1; i > 0; i--) {
                t9[i] = t9[i - 1];
            }

            t9[0] = firstEl;
        }

        for (int f : t9) {
            System.out.print(f);
        }
    }

    public void replaceWithNeighDividedIn2(double[] t10) {
        double firstEl = t10[1] / 2;
        double lastEl = t10[t10.length - 2] / 2;
        int index = 1;
        double[] arrayResult = new double[t10.length];

        for (int i = 1; i < t10.length - 1; i++) {
            arrayResult[index] = (t10[i + 1] + t10[i - 1]) / 2;
            index++;
        }

        arrayResult[0] = firstEl;
        arrayResult[arrayResult.length - 1] = lastEl;

        for (double i : arrayResult) {
            System.out.print(i + " ");
        }
    }

    public void printDifferenceOfTwoEqualArrays(double[] array1, double[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Arrays are not equal");
        } else {
            double[] resultArray = new double[array1.length];
            for (int i = 0; i < array1.length; i++) {
                resultArray[i] = array1[i] - array2[i];
            }

            for (double x : resultArray) {
                System.out.print(x + " ");
            }
        }
    }

    public void putArraysTogether(int[] array1, int[] array2) {
        int[] resultArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i];

        }
        for (int j = 0; j < array2.length; j++) {
            resultArray[array1.length + j] = array2[j];
        }

        for (int x : resultArray) {
            System.out.print(x + " ");
        }
    }

    public void printOnlyElementsFromBothArrays(int[] array1, int[] array2) {
        int resultArrayIndex = 0;
        int resultArrayLength = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    resultArrayLength++;
                }
            }
        }

        int[] resultArray = new int[resultArrayLength];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    resultArray[resultArrayIndex] = array1[i];
                    resultArrayIndex++;
                }
            }
        }

        for (int x : resultArray) {
            System.out.print(x + " ");
        }
    }

    public void printElementsOnlyFromOneArray(int[] array1, int[] array2) {

    }

    public void numbersThatDivideOn13And17(int length) {
        int count = 0;
        int[] resultArray = new int[length];

        for (int i = 0; i < 1.0 / 0.0; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                resultArray[count] = i;
                count++;
            } else if (count > length-1) {
                break;
            }
        }

        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }

    public void printAmountOfLocalMax(int[] t16) {
        int localMax = 0;

        for (int i = 0; i < t16.length; i++) {
            if (i == 0 && t16[i] > t16[i + 1]) {
                localMax++;
            } else if (i == t16.length - 1 && t16[i] > t16[i - 1]) {
                localMax++;
            } else if (t16[i] > t16[i + 1] && t16[i] > t16[i - 1]) {
                localMax++;
            }
        }

        System.out.println(localMax);
    }
}



