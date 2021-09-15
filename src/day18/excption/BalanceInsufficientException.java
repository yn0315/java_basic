package day18.excption;

public class BalanceInsufficientException extends Exception{


    public BalanceInsufficientException() {
    }

    public BalanceInsufficientException(String message) {//매개변수에 원인작성
        super(message);
    }

}
