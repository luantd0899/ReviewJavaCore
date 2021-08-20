package handlingexception;

public class BirthDayException extends Exception{

    public BirthDayException() {
    }

    public BirthDayException(String message) {
        super(message);
    }

    public String getMessage(){
        return "Ban da nhap sai birdDay, moi nhap lai!";
    }



}
