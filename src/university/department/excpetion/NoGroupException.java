package university.department.excpetion;

public class NoGroupException extends RuntimeException {
    public NoGroupException() {
        super("No group exists in department");
    }
}
