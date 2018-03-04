package pain.humiliation.java.internetGetto.PetroKozak.task12;

public class Task12 {
    private int SIZE = 200000000;

    public void callOutOfMemoryError() {
        int[] i = new int[SIZE];
    }

    public int callStackOverFlow(int number) {
        return number * callStackOverFlow(number);
    }

    public void tryHowExceptionsAreWorking(int[] array) {
        try {
            array[8] = 1;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("It should be the FUCKING EXCEPTION here. It isn't here, only because I caught IT.\n");
        } finally {
            System.out.println("NEVER EVER TRY TO PUT IN ARRAY THE ELEMENT WITH INDEX BIGGER THEN ARRAYS LENGTH. STUPID MOTHERFUCKER.");
        }
    }

    public void usingMyExceptionInAgeValidator(int age) throws PedroException {
        if (age <= 0) {
            throw new PedroException();
        } else {
            System.out.println("Your age is accepted.");
        }
    }

    class PedroException extends Exception {
        private String message = "The Age Cant Be NULL or Less Than NULL!!";

        public PedroException() {
            System.out.println(message);
        }
    }
}
