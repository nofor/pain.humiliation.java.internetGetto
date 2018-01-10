package pain.humiliation.java.internetGetto.Pbahher.task5;

@SuppressWarnings("Duplicates")

/**
 * Created by pbahher on 12/21/17.
 */


/**     Task 1. Write a program that prints the number of zero elements in a given integer array.
 *       Task 2. Write a program that prints the maximum element of a non-empty array.
 *       Task 3. Write a program (linear search) that defines the last occurrence of a given
 *          integer x in an array of integers that knowingly contains this number.
 *       Task 4. Write a program that prints the number of maximum elements of a nonempty
 *           array in which only one cycle is used.
 *       Task 5. Write a program, print an array, then invert (that is, swap the first element
 *           with the last, the second with the penultimate, etc.), and print again.
 *       Task 6. Write a program that prints an array, then sorts it (that is, rearranges its
 *           elements so that they are arranged in nondestructive order), and prints again.
 *       Task 7. Write a program that determines whether the entered phrase is a palindrome.
 *           A Palindrome is a phrase whose inverting does not change it. In this case all the gaps
 *           in the phrase are ignored.
 *       Task 8. Write a program that cyclically shifts array elements to the right one position,
 *           and prints the result. Cyclic means that the last element of the array becomes the very
 *           first element its element.
 *       Task 9. Write a program that cyclically shifts the elements of the array to the right
 *           by "k" positions, and prints the result.
 *       Task 10. Write a program that replaces all elements of the array, except the extreme ones,
 *           by half the sum neighbors, and prints the result.
 *       Task 11. Write a program that counts two non-empty arrays of integers in the range from
 *           zero to nine decimal representation of two numbers, prints their difference.
 *       Task 12. Write a program that consists of two non-empty non-decreasing arrays of integers,
 *           prints those and only those elements that occur in at least one of the arrays (the union of sets).
 *       Task 13. Write a program that consists of two non-empty non-decreasing arrays of integers,
 *           and prints those and only those elements that occur in both arrays (the intersection of sets).
 *       Task 14. Write a program that consists of two non-empty non-decreasing arrays of integers,
 *           prints those and only those elements that enter only one of the arrays (symmetric
 *           difference of sets).
 *       Task 15. Write a program that writes the first 100 natural numbers to the array,
 *           dividing into 13 or 17, and printing it.
 *       Task 16. Write a program that prints an integer number in an array of integers
 *           local maximum (the element is a local maximum if it does not have neighbors,
 *           greater than he himself).
 */

//TODO try to name methods by they logic //done
//TODO make all methods dynamic //done
//TODO do it with for each where it needed //done

class Task5 {

    public int printNullElements(int[] a) {
        int count = 0;

        for (int i : a) {
            if (i == 0) count++;
        }

        return count;
    }

    public int maxArrayElement(int[] a) {
        int b = a[0];

        for (int i : a) {
            if (b < i) b = i;
        }

        return b;
    }

    public int lastSpecifiedElement(int[] a, int b) {
        int x = 0;

        for (int i : a) {
            if (b == a[i]) {
                x = i;
            }
        }
        return (x);
    }

    public int amountMaxElement(int[] a) {
        int b = a[0];
        int count = 0;

        for (int i : a) {
            if (i > b) {
                b = i;
                count = 1;
            } else if (i == b) {
                count++;
            }
        }

        return count;
    }

    public void arrayInvert(int[] a) {

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

    public void arraySorting(int[] a) {
        String stringAsArray = "";

        Utils.sortMass(a);

        for (int i : a) {
            stringAsArray = stringAsArray + i + " ";
        }

        System.out.println(stringAsArray);
    }

    public boolean thisIsPalindrome(int[] a) {
        boolean b = false;

        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] == a[a.length - i - 1]) {
                b = true;
            } else {
                b = false;
            }
        }

        return b;
    }

    public void positionShiftOnOne(int[] a) {
        int temp = a[a.length - 1];
        String moveElement = "";

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;

        for (int i : a) {
            moveElement = moveElement + i + " ";
        }

        System.out.println(moveElement);
    }

    public void positionShiftOnK(int[] a) {
        int positions = 5;
        String moveElements = "";

        for (int i = 0; i < positions; i++) {
            int temp = a[a.length - 1];

            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }

            a[0] = temp;
        }

        for (int i : a) {
            moveElements = moveElements + i + " ";
        }

        System.out.println(moveElements);
    }

    public void halfSumm(double[] a) {  //есть вопрос, выводит первое и последнее число как 0
        double[] b = new double[5];

        for (int i = 1; i < a.length - 1; i++) {
            if (i - 1 < 0) {
                b[i] = (a[i + 1] + a[a.length - 1]) / 2;
            }

            if (i + 1 >= a.length) {
                b[i] = (a[i - 1] + a[0]) / 2;
            }

            if (!(i - 1 < 0) && !(i + 1 >= a.length)) {
                b[i] = (a[i - 1] + a[i + 1]) / 2;
            }
        }

        Utils.printDoubleMass(b);

    }

    public void differenceOfArrays(int[] a, int[] b) {
        int c[] = new int[9];

        for (int i : c) {
            c[i] = a[i] - b[i];
        }

        Utils.printIntMass(c);
    }

    public void unionOfSets(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    b[j] = 0;
                }
            }
        }

        int size = a.length;

        for (int i : b) {
            if (i != 0) {
                size++;
            }
        }

        int c[] = new int[size];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        int index = a.length;

        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                c[index] = b[i];
                index++;
            }
        }

        Utils.printIntMass(Utils.sortMass(c));
    }

    public void intersectionOfMany(int[] a, int[] b) {
        int c[];
        int size = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    size++;
                }
            }
        }

        c = new int[size];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[index] = b[j];
                    index++;
                }
            }
        }

        Utils.printIntMass(Utils.sortMass(c));
    }

    public void symmetricDifferenceOfSets(int[] a, int[] b) {
        int c[] = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && a[i] != 0 && b[i] != 0) {
                    a[i] = b[j] = 0;
                    break;
                }
            }
        }

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        int size = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                size++;
            }
        }

        int d[] = new int[size];
        size = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                d[size] = c[i];
                size++;
            }
        }

        Utils.printIntMass(Utils.sortMass(d));
    }

    public void divisionOfNumber() {
        int index = 0;
        int value = 0;
        int a[] = new int[100];

        do {
            if (value % 13 == 0 && value % 17 == 0) {
                a[index] = value;
                index++;
            }

            value++;
        } while (index < 100);

        Utils.printIntMass(a);
    }

    public void localMaximum(int[] a) {
        int[] b = new int[8];

        for (int i = 0; i < a.length; i++) {
            if (i - 1 < 0) {  //check for the first element
                if (a[i] > a[a.length - 1] && a[i] > a[i + 1]) {
                    b[i] = a[i];
                }
            }

            if (i + 1 >= a.length) { //check for the last element
                if (a[i] > a[i - 1] && a[i] > a[0]) {
                    b[i] = a[i];
                }
            }

            if (!(i - 1 < 0) && !(i + 1 >= a.length)) {  //all that is between the first and last element
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    b[i] = a[i];
                }
            }
        }

        int size = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                size++;
            }
        }

        int c[] = new int[size];
        int index = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                c[index] = b[i];
                index++;
            }
        }

        Utils.printIntMass(c);
    }
}
