package university.exception;

public class NoDepartmentException extends RuntimeException {

    public NoDepartmentException() {
        super("No department exists in university");
    }
}
