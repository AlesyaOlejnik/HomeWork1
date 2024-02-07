package lesson9;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
