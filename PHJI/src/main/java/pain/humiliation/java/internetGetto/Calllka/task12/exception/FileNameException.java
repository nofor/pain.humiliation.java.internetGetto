package pain.humiliation.java.internetGetto.Calllka.task12.exception;

public class FileNameException extends Exception {

    String message;

    public FileNameException(String someMessage){
        this.message = someMessage;
        System.out.println("\nMy exception works".toUpperCase());
    }

    public void outputExceptionsMessage(){
        System.out.println(message.toUpperCase());
    }

}
