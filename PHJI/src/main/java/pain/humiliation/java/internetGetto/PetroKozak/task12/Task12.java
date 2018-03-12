package pain.humiliation.java.internetGetto.PetroKozak.task12;

import pain.humiliation.java.internetGetto.PetroKozak.task12.exception.WrongAgeException;

public class Task12 {

    public void callOutOfMemoryError() {
        try {
            System.out.println(new int[Integer.MAX_VALUE]);
        } catch (OutOfMemoryError er) {
            System.out.println("OutOfMemoryError caught");
        }
    }

    public void callStackOverFlow(int number) {
        try {
            callStackOverFlow(++number);
        } catch (StackOverflowError er) {
            System.out.println("StackOverflowError caught");
        }
    }

    public void handleIndexOutOfBoundsException(int[] array) {
        try {
            array[array.length] = 1;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("It should be the FUCKING EXCEPTION here. It isn't here, only because I caught IT.\n");
        } finally {
            System.out.println("never ever try to put in array the element with index bigger then arrays length. stupid motherfucker.");
        }
    }

    public void usingMyExceptionInAgeValidator(int age) throws WrongAgeException {
        if (age <= 18) {
            throw new WrongAgeException("You wrote the wrong age");
        } else {
            System.out.println("Your age is accepted.");
        }
    }

    public void handleArrayIndexOutOfBoundsException(int[] temp, int x) {
        try {
            temp[temp.length] = x;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You're out Of Bounds");

            int count = 0;

            for (int h : temp) {
                if (h != 0) {
                    count++;
                }
            }

            temp[count] = x;
        }
    }

    public void handleArithmeticException(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ex) {
            System.out.println("You are not allowed to make this action");
        }
    }

    public void handleClassCastException(Object j) {
        try {
            System.out.println((String) j);
        } catch (ClassCastException ex) {
            System.out.println("You cant cast " + j.getClass().getName() + " to String");
        } finally {
            System.out.println("The program casted it to Integer. Value is: " + j);
        }
    }

    public void handleArrayStoreException(Object[] x, Object y) {
        try {
            x[1] = y;
        } catch (ArrayStoreException ex) {
            System.out.println("You cant add such data type to the " + x.getClass().getName() + " array");
        }
    }

    public void handleIllegalArgumentException(int x) {
        try {
            new Integer(String.valueOf(Long.MAX_VALUE));
        } catch (IllegalArgumentException ex) {
            System.out.println("You are to small to watch this Sasha Greys movie. TURN TV OFF!!!");
        }
    }

    public void handleNegativeArraySizeException(int size) {
        try {
            System.out.println(new int[size]);
        } catch (NegativeArraySizeException ex) {
            System.out.println("arrays size cant be less than null. but your brain size can.");
        }
    }

    public void handleNullPointerException(String x) {
        try {
            System.out.println(x.equals("something"));
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException caught.");
        }
    }

    public void handleNumberFormatException(int[] x) {
        try {
            System.out.println(x[new Integer(null)]);
        } catch (NumberFormatException ex) {
            System.out.println("You use the wrong format. Please change it.");

        }
    }
}
