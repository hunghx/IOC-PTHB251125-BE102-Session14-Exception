package re.exception;

public class MyCheckedException extends Exception{
    // ngoại lệ checked
    int code;
    String message;
    public MyCheckedException(int code, String message) {
        super(message);
        this.code = code;
    }
}
