package university.group.excpetion;

public class NoGroupStudentsException extends RuntimeException {

    public NoGroupStudentsException() {
        super("No students exists for the group");
    }
}
