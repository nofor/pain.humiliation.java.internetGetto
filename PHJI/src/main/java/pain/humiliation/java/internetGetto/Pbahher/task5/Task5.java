package pain.humiliation.java.internetGetto.Pbahher.task5;

/**
 * Created by pbahher on 12/21/17.
 */

//      Task 1. Write a program that prints the number of zero elements in a given integer array.
//      Task 2. Write a program that prints the maximum element of a non-empty array.
//      Task 3. Write a program (linear search) that defines the first occurrence of a given
//          integer x in an array of integers that knowingly contains this number.
//      Task 4. Write a program that prints the number of maximum elements of a nonempty
//          array in which only one cycle is used.
//      Task 5. Write a program, print an array, then invert (that is, swap the first element
//          with the last, the second with the penultimate, etc.), and print again.
//      Task 6. Write a program that prints an array, then sorts it (that is, rearranges its
//          elements so that they are arranged in nondestructive order), and prints again.
//      Task 7. Write a program that determines whether the entered phrase is a palindrome.
//          A Palindrome is a phrase whose inverting does not change it. In this case all the gaps
//          in the phrase are ignored.
//      Task 8. Write a program that cyclically shifts array elements to the right one position,
//          and prints the result. Cyclic means that the last element of the array becomes the very
//          first element its element.
//      Task 9. Write a program that cyclically shifts the elements of the array to the right
//          by "k" positions, and prints the result.
//      Task 10. Write a program that replaces all elements of the array, except the extreme ones,
//          by half the sum neighbors, and prints the result.
//      Task 11. Write a program that counts two non-empty arrays of integers in the range from
//          zero to nine decimal representation of two numbers, prints their difference.
//      Task 12. Write a program that consists of two non-empty non-decreasing arrays of integers,
//          prints those and only those elements that occur in at least one of the arrays (the union of sets).
//      Task 13. Write a program that consists of two non-empty non-decreasing arrays of integers,
//          and prints those and only those elements that occur in both arrays (the intersection of sets).
//      Task 14. Write a program that consists of two non-empty non-decreasing arrays of integers,
//          prints those and only those elements that enter only one of the arrays (symmetric
//          difference of sets).
//      Task 15. Write a program that writes the first 100 natural numbers to the array,
//          dividing into 13 or 17, and printing it.
//      Task 16. Write a program that prints an integer number in an array of integers
//          local maximum (the element is a local maximum if it does not have neighbors,
//          greater than he himself).

public class Task5 {

    public void homework1() {
        int[] a = {2, 3, 0, 4, 0, 3, 0, 0};
        int b = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                count++;
            }
        }
        System.out.print(count);
    }

    public void homework2() {
        int[] a = {2, 3, 0, 4, 0, 3, 0, 0};
        int b = a[0];

        for (int i = 0; i < a.length; i++) {
            if (b < a[i]) {
                b = a[i];
            }
        }
        System.out.println(b);
    }

    public void homework3() {
        int[] a = {2, 7, 3, 4, 0, 3, 0, 0};
        int x = 3;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println(i); //First element of occurrence
                break;
            }
        }
    }

    public void homework4() {
        int[] a = {1, 3, 7, 0, 4, 7, 0, 2};
        int count = 0;
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                count++;
            }
        }
        System.out.println("\n" + max); // Max element
        System.out.println(count); //Amount of ellements
    }

    public void homework5() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = a.length -1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

    public void homework6() {

    }

    public void homework7() {
        int[] a = {0, 1, 2, 3, 2, 1, 0};

        for (int i = 0; i < a.length; i++) {
            int b = a.length - i - 1;
            if (a[i] != a[b]) {
                System.out.println("Not a palindrome.");
            }
            b--;
        }
        System.out.println("Palindrome.");
    }

    public void homework8() {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp = a[a.length - 1];

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;

        String moveElement = "";

        for (int i : a) {
            moveElement = moveElement + i + " ";
        }
        System.out.println(moveElement);
    }

    public void homework9() {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int positions = 3;

        for (int i = 0; i < positions; i++) {
            int temp = a[a.length - 1];

            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }

            a[0] = temp;
        }

        String moveElements = "";

        for (int i : a) {
            moveElements = moveElements + i + " ";
        }
        System.out.println(moveElements);
    }

    public void homework10() {

    }

    public void homework11() {

    }

    public void homework12() {

    }

    public void homework13() {

    }

    public void homework14() {

    }

    public void homework15() {

    }

    public void homework16() {

    }

}
