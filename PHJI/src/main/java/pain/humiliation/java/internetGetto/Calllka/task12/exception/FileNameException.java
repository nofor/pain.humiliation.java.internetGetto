package pain.humiliation.java.internetGetto.Calllka.task12.exception;

//todo you have _getMessage_ method in exception, this method is excessive DONE
public class FileNameException extends RuntimeException {  //todo extend RuntimeException DONE

    String message;
    private static final String OUTPUT_DEFAULT_MESSAGE = "\nMy exception works".toUpperCase();

    public FileNameException(String someMessage){
        this.message = someMessage;
        System.out.println(OUTPUT_DEFAULT_MESSAGE);    //todo use static final variable for it DONE
    }

}
