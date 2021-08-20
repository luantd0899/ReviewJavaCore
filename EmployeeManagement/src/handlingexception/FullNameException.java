package handlingexception;

public class FullNameException extends Exception {
    public FullNameException() {
    }

    public FullNameException(String message) {
        super(message);
    }

    public String getMessage(){
        return "Ban da nhap sai fullName, moi nhap lai!";
    }
}
