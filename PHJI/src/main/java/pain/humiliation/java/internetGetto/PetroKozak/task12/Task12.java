package pain.humiliation.java.internetGetto.PetroKozak.task12;

public class Task12 {
    private int SIZE = 200000000;

    public void callOutOfMemoryError() {
        int[] i = new int[SIZE];
    }

    public int callStackOverFlow(int number) {
        return number * callStackOverFlow(number);
    }

    public void handleIndexOutOfBoundsException(int[] array) {
        try {
            array[array.length] = 1;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("It should be the FUCKING EXCEPTION here. It isn't here, only because I caught IT.\n");
        } finally {
            System.out.println("NEVER EVER TRY TO PUT IN ARRAY THE ELEMENT WITH INDEX BIGGER THEN ARRAYS LENGTH. STUPID MOTHERFUCKER.");
        }
    }

    public void usingMyExceptionInAgeValidator(int age) throws PedroException {
        if (age <= 18) {
            throw new PedroException();
        } else {
            System.out.println("Your age is accepted.");
        }
    }

    public void handleArrayIndexOutOfBoundsException(int[] temp, int x) {
        try {
            temp[temp.length] = x;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You're out Of Bounds");
        } finally {
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
            System.out.println("The programm casted it to Integer. Value is: " + j);
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
            setYourAge(x);
        } catch (IllegalArgumentException ex) {
            System.out.println("You are to small to watch this Sasha Greys movie. TURN TV OFF!!!");
        }
    }

    public void handleNegativeArraySizeException(int size) {
        try {
            int[] temp = new int[size];
        } catch (NegativeArraySizeException ex) {
            System.out.println("ARRAYS SIZE CANT BE NULL. But your brain size can.");
        }
    }

    public void handleNullPointerException(String x) {
        try {
            System.out.println(x.equals("something"));
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException caught.");
        }
    }

    private void setYourAge(int yourAge) {
        if (yourAge < 18) {
            throw new IllegalArgumentException();
        }
    }

    public void handleNumberFormatException(int[] x) {
        try {
            System.out.println(x[new Integer(null)]);
        } catch (NumberFormatException ex) {
            System.out.println("You use the wrong format. Please change it.");
        }
    }

    class PedroException extends Exception {
        private String message = "YOU SHOULD BE AT LEAST 18 YEARS OLD, YOU LITTLE BASTARD!!";

        public PedroException() {
            System.out.println(message);
        }
    }
}
