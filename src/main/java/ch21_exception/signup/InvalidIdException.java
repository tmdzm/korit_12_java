package ch21_exception.signup;

public class InvalidIdException extends Exception{
    public InvalidIdException(String message) {
        super(message);
        System.out.println("ID는 8자 이상이어야 합니다.");
    }
}
