package university.department.exception;

public class NoGroupException extends RuntimeException {
    public NoGroupException() {
        super("No group exists in department");
    }
}
