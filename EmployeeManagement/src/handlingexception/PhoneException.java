package handlingexception;

public class PhoneException extends Exception {
    public PhoneException() {
    }

    public PhoneException(String message) {
        super(message);
    }

    public String getMessage(){
        return "Ban da nhap sai Phone, moi nhap lai!";
    }
}
