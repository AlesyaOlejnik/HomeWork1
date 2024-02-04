package lesson9;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(){
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
