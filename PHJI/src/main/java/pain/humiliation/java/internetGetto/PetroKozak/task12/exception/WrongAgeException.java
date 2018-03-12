package pain.humiliation.java.internetGetto.PetroKozak.task12.exception;

public class WrongAgeException extends RuntimeException {

    String message;

    public WrongAgeException(String userMessage) {
        this.message = userMessage;
        System.out.println(this.getClass().getName());
    }

    public void outputMessage() {
        System.out.println(this.message);
    }
}
