package pain.humiliation.java.internetGetto.Calllka.task12.exception;

public class FileNameException extends Exception {  //todo extend RuntimeException

    String message;

    public FileNameException(String someMessage){
        this.message = someMessage;
        System.out.println("\nMy exception works".toUpperCase());    //todo use static final variable for it
    }

    public void outputExceptionsMessage(){  //todo you have _getMessage_ method in exception, this method is excessive
        System.out.println(message.toUpperCase());
    }

}
