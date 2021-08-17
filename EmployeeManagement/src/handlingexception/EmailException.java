package handlingexception;

public class EmailException extends Exception {
    public String getMessage(){
        return "Ban da nhap sai Email, moi nhap lai!";
    }
}
