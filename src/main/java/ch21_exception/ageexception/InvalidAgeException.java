package ch21_exception.ageexception;

public class InvalidAgeException extends Exception{
    //super(message);
    public InvalidAgeException(String message){
        super(message);
    }

}
