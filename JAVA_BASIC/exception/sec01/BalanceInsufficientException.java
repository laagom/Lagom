package JAVA_BASIC.exception.sec01;

public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {
    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}